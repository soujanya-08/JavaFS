var x = 10;
let y = 20;
const z = 30;

function abc(){
    x =12;
    y=90;
     //let y=13;//This will be a new y variable used only in this block
    const z = 100;
   // z=15; cannot assign to a constant it can only be initialised once while declaring
    console.log("Block scope " + x);
    console.log("Block scope " +y);
    console.log("Block scope " +z);
}
abc();
console.log(x);
console.log(y);//if y,is changed in block scope, tht will be changed in next scopes also
console.log(z);