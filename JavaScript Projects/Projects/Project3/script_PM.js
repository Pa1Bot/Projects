//Declaring the variables
var productQty_PM = [],
  customerData_PM = [],
  totalItemPrice_PM = [],
  SubTotalBeforeTax_PM = 0,
  totalTax_PM,
  discount_PM = 0,
  salesTotal_PM;

var productPrices_PM = [15.0, 50.0, 10.0],
  productNames_PM = ["T-Shirt", "Jacket", "cap"];

function moreInfo1() {
  document.getElementById("p1_info").innerHTML =
    "Available color options: Black";
}
function moreInfo2() {
  document.getElementById("p2_info").innerHTML =
    "Available color options: White";
}
function moreInfo3() {
  document.getElementById("p3_info").innerHTML =
    "Available color options: Blue";
}

function receipt() {
  const cPhoneFormat_PM = /^(\d{3}-\d{3}-\d{4})$/;

  productData();
  customerData();

  //Displaying error messages for product data
  if (isNaN(productQty_PM[0]) || productQty_PM[0] < 0) {
    document.getElementById("cTshirtsError").innerHTML =
      "Please provide valid number";
  }
  if (isNaN(productQty_PM[1]) || productQty_PM[1] < 0) {
    document.getElementById("cJacketsError").innerHTML =
      "Please provide valid number";
  }
  if (isNaN(productQty_PM[2]) || productQty_PM[2] < 0) {
    document.getElementById("cCapsError").innerHTML =
      "Please provide valid number";
  }

  //Displaying error messages for customer data
  if (productQty_PM[0] <= 0 && productQty_PM[1] <= 0 && productQty_PM[2] <= 0) {
    document.getElementById("qtyError").innerHTML =
      "Please provide atleast one product quantity";
  }
  if (customerData_PM[0] == "" || customerData_PM[0] == " ") {
    document.getElementById("cNameError").innerHTML =
      "Please provide name to proceed to the receipt";
  }
  if (!cPhoneFormat_PM.test(customerData_PM[1]) || customerData_PM[1] == " ") {
    document.getElementById("cPhoneError").innerHTML =
      "Phone number should be in the following format (xxx)-xxx-xxxx, Eg: 512-123-1234";
  }

  if (customerData_PM[2] == "" || customerData_PM[2] == " ") {
    document.getElementById("cProvinceError").innerHTML =
      "Please select your province to proceed to the receipt";
  }

  //Executing the output function if all the data is in correct format
  if (
    isNaN(productQty_PM[0]) ||
    isNaN(productQty_PM[1]) ||
    isNaN(productQty_PM[2]) ||
    (productQty_PM[0] <= 0 && productQty_PM[1] <= 0 && productQty_PM[2] <= 0) ||
    customerData_PM[0] == "" ||
    !cPhoneFormat_PM.test(customerData_PM[1]) ||
    customerData_PM[2] == ""
  ) {
  } else {
    outputTable();
  }
  return false;
}

//Gathering Product data provided by the user
function productData() {
  var productQtyDump_PM = document.querySelectorAll(".qnt");
  for (var i = 0; i < productQtyDump_PM.length; i++) {
    productQty_PM[i] = productQtyDump_PM[i].value;
  }
  console.log(`Product quantity values are ${productQty_PM}`);
}

//Gathering customer data provided by the user
function customerData() {
  var customerDataDump_PM = document.querySelectorAll(".cinp");
  for (var m = 0; m < customerDataDump_PM.length; m++) {
    customerData_PM[m] = customerDataDump_PM[m].value;
  }
  console.log(`Customer data values are ${customerData_PM}`);
}

//Generating table dynamically and perfroming the calculations
function outputTable() {
  document.getElementById("receiptHeading").innerHTML = "<h1>Invoice</h1>";
  let table_PM = "<table>";
  for (a = 0; a <= 2; a++) {
    if (!(productQty_PM[a] <= 0)) {
      table_PM += "<tr>";
      for (let j = 0; j < 1; j++) {
        console.log(productQty_PM[a], productNames_PM[a], productPrices_PM[a]);
        totalItemPrice_PM[a] = productQty_PM[a] * productPrices_PM[a];
        table_PM += `<td>Item Quantity:</td><td style="padding-right: 15px">${productQty_PM[a]}</td><td>Name:</td><td style="padding-right: 15px">${productNames_PM[a]}</td><td>Unit Price:</td><td style="padding-right: 15px">$${productPrices_PM[a]}/${productNames_PM[a]}</td><td>Total Item Price:</td><td style="padding-right: 15px">$${totalItemPrice_PM[a]}</td>`;
        SubTotalBeforeTax_PM += parseFloat(totalItemPrice_PM[a]);
        console.log(SubTotalBeforeTax_PM);
      }
      table_PM += "</tr>";
    } else {
    }
  }
  totalTax_PM = parseFloat(0.13 * SubTotalBeforeTax_PM);
  if (customerData_PM[2] == "Ontario") {
    discount_PM = 0.1 * (SubTotalBeforeTax_PM + totalTax_PM);
  }
  salesTotal_PM = SubTotalBeforeTax_PM + totalTax_PM + discount_PM;
  table_PM += `<tr><td colspan=3>Sub total before tax: </td><td colspan=2>${SubTotalBeforeTax_PM} </td></tr>`;
  table_PM += `<tr><td>Total tax: </td><td colspan=2>${totalTax_PM} </td></tr>`;
  if (customerData_PM[2] == "Ontario") {
    table_PM += `<tr><td>Discount: </td><td colspan=2>${discount_PM.toFixed(
      2
    )} </td></tr>`;
  }
  table_PM += `<tr><td>Sales total: </td><td colspan=2>${salesTotal_PM.toFixed(
    2)} </td></tr>`;
    table_PM +=`<tr><td>Customer Name: </td><td colspan=2>${customerData_PM[0]} </td></tr>`;
    table_PM +=`<tr><td>Customer Phone: </td><td colspan=2>${customerData_PM[1]} </td></tr>`;
    table_PM +=`<tr><td>Province: </td><td colspan=2>${customerData_PM[2]} </td></tr>`;
  table_PM += "</table>";
  document.getElementById("receipt").innerHTML = table_PM;
}
