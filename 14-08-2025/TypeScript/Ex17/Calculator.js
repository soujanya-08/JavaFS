var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    Calculator.prototype.sub = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
var cal = new Calculator();
console.log("Add", cal.add(2, 10));
console.log("Subtract", cal.sub(100, 20));
