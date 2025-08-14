let arr = [2,3,4,5,6];

const sum=(arr)=>{
var sum =0;
for(let i=0;i<arr.length;i++){
    sum= sum + arr[i];
}
return sum;
}
console.log(sum(arr));