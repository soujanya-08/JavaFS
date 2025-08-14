class BankAccount{
    constructor(accountNumber, balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    deposit(amount){
        this.balance +=  amount;
        return `Your balance is ${this.balance}`;

    }
    withdraw(amount){
        if(this.balance - amount >0){
            this.balance = this.balance - amount;
            return `New balance is ${this.balance}`
        }
        else{
            return `Insufficient balance ${this.balance} cannot withdraw ${amount}`;
        }
    }
}
let bank = new BankAccount("ASD2334", 10000);
console.log(bank.deposit(1000));
console.log(bank.withdraw(2000));
console.log(bank.withdraw(10000));