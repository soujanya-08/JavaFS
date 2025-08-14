var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var numberBox = new Box(20);
console.log(numberBox);
var name1 = new Box("Rectangle");
console.log(name1);
