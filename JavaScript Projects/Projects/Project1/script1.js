//Declaring and initilizing variables
var apple=0;
var strawberry=0;
var blueberry=0;
var blackberry=0;
var raspberry=0;
var customerName="";

//Taking  inputs from customer
function addToCartApple(){
    apple = parseInt(prompt("Please provide the product quantity"));
    while(isNaN(apple)||apple<0||apple==0)
    {
     apple = prompt("Please provide a valid number");
    }
    document.getElementById("appN").textContent=`Green Apple- $3 x ${apple}`;
    document.getElementById("checkout").style.visibility="visible";
  }
  function addToCartSB(){
    strawberry = parseInt(prompt("Please provide the product quantity"));
    while(isNaN(strawberry)||strawberry<0||strawberry==0)
    {
        strawberry = prompt("Please provide a valid number");
    }
    document.getElementById("sbN").textContent=`Strawberries- $3.4 x ${strawberry}`;
    document.getElementById("checkout").style.visibility="visible";
  }
  function addTocartBlueberry(){
    blueberry = parseInt(prompt("Please provide the product quantity"));
    while(isNaN(blueberry)||blueberry<0||blueberry==0)
    {
        blueberry = prompt("Please provide a valid number");
    }
    document.getElementById("blueN").textContent=`Blueberries- $3.5 x ${blueberry}`;
    document.getElementById("checkout").style.visibility="visible";
  }
  function addTocartBlackberry(){
    blackberry = parseInt(prompt("Please provide the product quantity"));
    while(isNaN(blackberry)||blackberry<0||blackberry==0)
    {
        blackberry = prompt("Please provide a valid number");
    }
    document.getElementById("blackN").textContent=`Blackberries- $3.6 x ${blackberry}`;
    document.getElementById("checkout").style.visibility="visible";
  }
  function addTocartRaspberry(){
    raspberry=parseInt(prompt("Please provide the product quantity"));
    while(isNaN(raspberry)||raspberry<0||raspberry==0)
    {
        raspberry = prompt("Please provide a valid number");
    }
    document.getElementById("raspN").textContent=`Raspberries- $3.2 x ${raspberry}`;
    document.getElementById("checkout").style.visibility="visible";
  }
  //Check out function
  function checkOut() {
    customerName = prompt("Please provide your name to place the order");
    //Validating customer input
    while(customerName==""){
      customerName = prompt("Please provide your name to place the order");
    }
    document.getElementById("cname").textContent="Customer Name:"+customerName;
     document.getElementById("tab2").style.visibility="visible";
    //Displaying reciept table data
    if((apple*3)!=0){
      document.getElementById("a").style.visibility="visible";
      document.getElementById("appQuantity").textContent=apple;
    document.getElementById("appTot").textContent="$"+ parseFloat(apple*3);
    }
    if((strawberry*3.4)!=0){
      document.getElementById("s").style.visibility="visible";
      document.getElementById("sQuantity").textContent=strawberry;
      document.getElementById("sTot").textContent="$"+ parseFloat(strawberry*3.4);
    }
    if((blueberry*3.5)!=0){
      document.getElementById("be").style.visibility="visible";
      document.getElementById("beQuantity").textContent=blueberry;
      document.getElementById("beTot").textContent="$"+ parseFloat(blueberry*3.5);
    }
    if((blackberry*3.6)!=0){
      document.getElementById("bk").style.visibility="visible";
      document.getElementById("bkQuantity").textContent=blackberry;
      document.getElementById("bkTot").textContent="$"+ parseFloat(blackberry*3.6);
    }
    if((raspberry*3.2)!=0){
      document.getElementById("r").style.visibility="visible";
      document.getElementById("rQuantity").textContent=raspberry;
      document.getElementById("rTot").textContent="$"+ parseFloat(raspberry*3);
    }
    //GST calculation
    const gst=((apple*3)+(strawberry*3.4)+(blueberry*3.5)+(blackberry*3.6)+(raspberry*3.2))*0.13;
    document.getElementById("gst").textContent=gst;
    //Total price calculation
    var total=((apple*3)+(strawberry*3.4)+(blueberry*3.5)+(blackberry*3.6)+(raspberry*3.2))+gst;
    document.getElementById("tot").textContent=total;
  }
  
