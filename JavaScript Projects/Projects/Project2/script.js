// Declaring variables
var customerName, customerEmail, ccNumber, ccMonth, ccYear, quantity;
var waterBottles, caps, pens, candies, cupCakes;
var totalPrice=[], finalDonation, minDonation=10,perDonation, total=0;

var customerDetails = ["Name","Email","Credit Card Number","Credit Card Expiry Month","Credit Card Expiry Year",];
var customerData = [];

var productNames = ["Water Bottles","Caps","Pens","Candy Bags","Cup Cakes"];
var productQuantity = [];
var productPrices = [5, 20, 2, 10, 3];

function checkOut() {
    //Customer data
    var customerDataDump = document.querySelectorAll(".cinp");
    for (var k = 0; k < customerDataDump.length; k++) {
      customerData[k] = customerDataDump[k].value;
    }
    console.log(`Customer data values are ${customerData}`);
  
    //Product data
    var productQuantityDump = document.querySelectorAll(".qnt");
    for (var l = 0; l < productQuantityDump.length; l++) {
      productQuantity[l] = productQuantityDump[l].value;
    }
    console.log(`Product quantity values are ${productQuantity}`);
  
  //Validating Name and email to make them mandatory
  customerName = document.getElementById("cname").value;
  customerEmail = document.getElementById("cemail").value;
  if (customerName == "") {
    document.getElementById("mand1").innerHTML =
      "*Customer name is mandatory so please provide your name for checkout";
    if (customerEmail == "") {
      document.getElementById("mand2").innerHTML =
        "*Customer email is mandatory so please provide your email for checkout";
    }
  }
    //Validating Credit card number, month and year formats
    ccNumber = document.getElementById("ccnum").value;
    ccMonth = document.getElementById("ccmon").value;
    ccYear = document.getElementById("ccyr").value;
    const ccNumberRegex = /^(\d{4}-\d{4}-\d{4}-\d{4})$/;
    const ccMonthRegex = /^(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)$/;
    const ccYearRegex = /^\d{4}$/;
    if (!ccNumberRegex.test(ccNumber)) {
      document.getElementById("ccNumError").innerHTML =
        "*Please provide valid credit card number in following format eg: 4111-1111-1111-1111";
    }
    if (!ccMonthRegex.test(ccMonth)) {
      document.getElementById("ccMonthError").innerHTML =
        "*Please provide valid credit card expiry month in following format eg: NOV";
    }
    if (!ccYearRegex.test(ccYear)) {
      document.getElementById("ccYearError").innerHTML =
        "*Please provide valid credit card expiry year in following format eg:2021";
    }
  
    //Fetching  products quantity
    waterBottles = document.getElementById("bottle").value;
    caps = document.getElementById("cap").value;
    pens = document.getElementById("pen").value;
    candies = document.getElementById("candy").value;
    cupCakes = document.getElementById("cake").value;

//Validating the quantity input types and displaying the error message
if(waterBottles <=0 && caps<=0 && pens<=0 && candies<=0 && cupCakes<=0){
  document.getElementById("error").innerHTML="Please provide the quantity for atleast one item to proceed with checkout";
}
  if (waterBottles == "") {
  } else if (isNaN(parseInt(waterBottles))) {
  document.getElementById("bottleError").innerHTML =
    "Please provide valid number";
  }

  if (caps == "") {
  } else if (isNaN(parseInt(caps))) {
  document.getElementById("capError").innerHTML =
    "Please provide valid number";
  }

  if (pens == "") {
  } else if (isNaN(parseInt(pens))) {
  document.getElementById("penError").innerHTML =
    "Please provide valid number";
  }

  if (candies == "") {
  } else if (isNaN(parseInt(candies))) {
  document.getElementById("candyError").innerHTML =
    "Please provide valid number";
  }

  if (cupCakes == "") {
  } else if (isNaN(parseInt(cupCakes))) {
  document.getElementById("cakeError").innerHTML =
    "Please provide valid number";
  }
  
else{
  calc();
}
}
 //Performing calculations
function calc(){ 
for (let m = 0; m < productPrices.length; m++) {
  totalPrice[m]=productPrices[m]*productQuantity[m];
  total +=parseFloat(totalPrice[m]);
}
console.log(`totalPrice is${totalPrice}, total is${total}`);
perDonation=total*0.1;
finalDonation=Math.max(minDonation,perDonation);
total += finalDonation;
console.log(`Final Donation is$ ${finalDonation}, Total price with donation is${total}`);
receipt();
} 

  //Displaying Output
function receipt(){

  //Generating table1
  var i = 0;
  document.write("Thank you for your Purchase");
  document.write("<table border=1>");
  for (i = 0; i < parseInt(customerData.length); i++) {
    if (customerData[i] !== "") {
      document.write("<tr>");
      for (let j = 0; j < 1; j++) {
        //Displaying only last 4 digits of the credit card
        if (customerDetails[i] == "Credit Card Number") {
          customerData[i] = `xxxx-xxxx-xxxx-${customerData[i].slice(15, 19)}`;
        }
        document.write(
          `<td>${customerDetails[i]}</td><td>${customerData[i]}</td>`
        );
      }
      document.write("</tr>");
    } else {
    }
  }
  document.write("</table>");


  //Generating table2
  var a = 0;
  document.write("<table border=1>");
  document.write(
    "<tr><td>Item</td><td>Quantity</td><td>UnitPrice</td><td>Total Price</td></tr>"
  );
  for (a = 0; a <= 4; a++) {
    if (!(productQuantity[a] <= 0)) {
      document.write("<tr>");
      for (let j = 0; j < 1; j++) {
        document.write(
          `<td>${productNames[a]}</td><td>${productQuantity[a]}</td><td>${productPrices[a]}</td><td>${totalPrice[a]}</td>`
        );
      }
      document.write("</tr>");
    } else {
    }
  }
  document.write(
    `<tr><td>Donation</td><td colspan=2 >Minimum</td><td>${finalDonation}</td></tr>`
  );
  document.write(`<tr><td colspan=3>Total</td><td>${total}</td>`);
  document.write("</table>");
  }
