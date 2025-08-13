let employees =[
    {
        empID:1,
        name:"James",
        role:"Manager",
        salary:20000
    },
    {
        empID:1,
        name:"Jhon",
        role:"QA",
        salary:2000
    },
    {
        empID:1,
        name:"Jacob",
        role:"Manager",
        salary:20000
    },
    {
        empID:1,
        name:"Jagan",
        role:"Manager",
        salary:10000
    },
    {
        empID:1,
        name:"Harry",
        role:"Developer",
        salary:50000
    }
]

let managerSal = employees.filter(e=>e.role==="Manager").reduce((sal,emp)=>
    {sal = sal+ emp.salary;
        return sal;
    }
,0);
console.log(managerSal)