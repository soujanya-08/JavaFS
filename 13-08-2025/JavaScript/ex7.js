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
    },

]
let canVote = persons.filter(p=>p.age>=18);
console.log(canVote);