class Box<T>{
    private value:T;
    constructor(value:T){
        this.value = value;
    }
    getValue():T{
        return this.value;
    }
}
const numberBox = new Box<number>(20);
console.log(numberBox);
const name1 = new Box<string>("Rectangle");
console.log(name1);
