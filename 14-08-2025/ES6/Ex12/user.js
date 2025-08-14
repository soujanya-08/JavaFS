export default class User{
    constructor(name){
        this.name = name;
    }
    getName(){
        return `Hello ${this.name}, have a nice day!`;

    }
}