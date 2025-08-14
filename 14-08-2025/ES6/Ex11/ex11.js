
const sumOfNumbers= (...args)=>{
    return args.reduce((sum, num) => sum+num, 0);
}
console.log(sumOfNumbers(2,4,5,6,10));