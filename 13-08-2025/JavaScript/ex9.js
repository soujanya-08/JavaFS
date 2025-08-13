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
for(let i=0;i<persons.length;i++){
    if(persons[i].age>=18){
        persons[i].status ="Adult";
    }
    else{
        persons[i].status ="Minor";
    }
}
console.log(persons)