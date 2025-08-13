function getValues() {
    const num1 = parseFloat(document.getElementById("num1").value);
    const num2 = parseFloat(document.getElementById("num2").value);
    return { num1, num2 };
}

function add() {
    const { num1, num2 } = getValues();
    document.getElementById("output").innerText = num1 + num2;
}

function sub() {
    const { num1, num2 } = getValues();
    document.getElementById("output").innerText = num1 - num2;
}

function mul() {
    const { num1, num2 } = getValues();
    document.getElementById("output").innerText = num1 * num2;
}

function div() {
    const { num1, num2 } = getValues();
    if (num2 === 0) {
        document.getElementById("output").innerText = "Cannot divide by zero";
    } else {
        document.getElementById("output").innerText = num1 / num2;
    }
}