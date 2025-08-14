class Vehicle{
    constructor(make, model, year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    getInfo(){
        `Vehicle make is : ${this.make} model is : ${this.model} year ${this.year}`
    }
}
class Car extends Vehicle{
    constructor(make, model, year, numDoors){
        super(make,model,year);
        this.numDoors = numDoors;
    }
   
    getInfo(){
        return `Vehicle make is : ${this.make} model is : ${this.model} year ${this.year} and Number of doors is ${this.numDoors}`

    }
}
const car =new Car("Hyundai", "Grand i10", 2019, 4);
console.log(car.getInfo());