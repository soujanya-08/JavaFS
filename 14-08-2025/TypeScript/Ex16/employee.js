var employeeList = [
    { empID: 1,
        empName: "Nikita",
        salary: 20000
    },
    { empID: 2,
        empName: "Sangeetha",
        salary: 40000
    }
];
function printEmployees(employees) {
    employees.forEach(function (emp) {
        console.log("ID: ".concat(emp.empID, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    });
    return employees.length;
}
function printemp(e) {
    e.forEach(function (emp) {
        console.log("ID: ".concat(emp.empID, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    });
    return e.length;
}
var count = printEmployees(employeeList);
console.log("Total Employees: ".concat(count));
