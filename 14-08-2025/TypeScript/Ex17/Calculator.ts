class Calculator{
    add(a:number, b:number):number{
        return a+b;
    }
    sub(a:number, b:number):number{
        return a-b;
    }
}
const cal = new Calculator();
console.log("Add",cal.add(2,10));
console.log("Subtract",cal.sub(100,20));