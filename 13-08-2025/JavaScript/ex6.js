let names =["Soujanya", "Ashish", "Nikita","Sangeetha", "Uma"];

let fiveCharLong = names.filter((name) =>name.length >=5);
let upperCase = fiveCharLong.map((name) =>name.toUpperCase());
console.log(upperCase);