// import the dependencies
const express= require('express');
const path=require('path');
const app = express();
const {check, validationResult} = require('express-validator');

// set up for views and public folders
app.set('views', path.join(__dirname, 'views'));
app.use(express.static(__dirname+'/public'));
app.set('view engine', 'ejs');
app.use(express.urlencoded({encoded: false}));

// Route for the home page
app.get('/',function(req,res){
    res.render('home',{errors:[],invoiceData:{}});
});
 
//Declaring the regex variables for phone & email
var phoneRegex=/^[0-9]{10}$/;
var emailRegex= /^[a-z]+@+[a-z]+.com$/;

//Route for the invoice page
app.post('/',[
    check('name',"Please enter name.").notEmpty(),
    check('address',"Please enter the address.").notEmpty(),
    check('city',"Please enter the city.").notEmpty(),
    check('province',"Please enter the province.").notEmpty(),
    check('phone',"Please enter valid phone number").matches(phoneRegex),
    check('email',"Please enter valid email").matches(emailRegex)
],function(req,res){
    const errors=validationResult(req);
    console.log("Errors",errors);
    if (!errors.isEmpty()) {
        res.render('home',{errors: errors.array(),invoiceData: null});
    }
    else{
        // fetching all fields values
        var name=req.body.name;
        var address=req.body.address;
        var province=req.body.province;
        var city=req.body.city;
        var phone=req.body.phone;
        var email=req.body.email;
        var dellLaptop=req.body.dellLaptop;
        var hpLaptop=req.body.hpLaptop;
        var productData=[];
        //
        if (dellLaptop) {
            productData.push({Name: "Dell Laptop", Price:700, Quantity: parseFloat(req.body.dellLaptop)});
        }
        if (hpLaptop) {
            productData.push({Name: "Hp Laptop", Price:600, Quantity: parseFloat(req.body.hpLaptop)});
        }
        console.log("Dell",dellLaptop)
        console.log("hp",hpLaptop)
        console.log("Combi",productData)
        var productPrice=dellLaptop*700 + hpLaptop*600;
console.log(productPrice);
        //Validating for price lessthan $10
        if (productPrice<10) {
            return res.render("home", {
                errors: [{ msg: "The minimum purchase price should be $10."}],invoiceData: null
              });
        }

    //Calculating salestax
    const taxes={
        ON:0.13,
        Quebec:0.14,
        Vancouver:0.15
    }
    var salesTax=taxes[province]*productPrice;
    var totalPrice= productPrice+salesTax;

    //Invoice information
    var invoiceData={
        name:name,
        address:address,
        province:province,
        city:city,
        phone:phone,
        email:email,
        productData:productData,
        productPrice:productPrice,
        salesTax:salesTax,
        totalPrice:totalPrice
    }
    console.log(invoiceData.phone,invoiceData.email);
    res.render('invoice',{errors:[],invoiceData:invoiceData})
    // data.push(data);
    // res.redirect("/");
}
});
app.listen(3000,function(){
    console.log("Listening to port 3000");
});