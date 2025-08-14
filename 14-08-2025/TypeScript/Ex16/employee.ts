interface Employee{
    empID:number;
    empName :string;
    salary:number;
}
let employeeList:Employee[] =[
    { empID:1,
    empName:"Nikita",
    salary:20000
},
{ empID:2,
    empName:"Sangeetha",
    salary:40000
}
]
   
function printEmployees(employees: Employee[]): number {
    employees.forEach(emp => {
        console.log(`ID: ${emp.empID}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    });
    return employees.length;
}
function printemp(e:Employee[]):number{
    e.forEach(emp=>{
        console.log(`ID: ${emp.empID}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    });
    return e.length;

}
const count = printEmployees(employeeList);
console.log(`Total Employees: ${count}`);