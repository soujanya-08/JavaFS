let persons =[
    {
        name:"Smith",
        age:35,
        residence:"Karnataka"
    },
    {
        name:"Joy",
        age:15,
        residence:"Delhi"
    },
    {
        name:"Tim",
        age:18,
        residence:"Kerala"
    },
    {
        name:"Uma",
        age:5,
        residence:"Karnataka"
    }
]
let status = persons.map(person=>person.age>=18?person.status="Adult":person.status="Minor");

console.log(persons)