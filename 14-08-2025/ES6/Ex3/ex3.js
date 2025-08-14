class Util{
    getDate(){
        const date = new Date();
       
    const day = String(date.getDate()).padStart(2, '0');       
    const month = String(date.getMonth() + 1).padStart(2, '0'); 
    const year = date.getFullYear();                            
    
    return `${day}-${month}-${year}`;
       // return (date.getDate() +"-"+ date.getMonth() + "-" + date.getFullYear());
    }
    getPIValue(){
        return Math.PI;
    }
    convertC2F(centigrade){
        return (centigrade*1.8) +32;
    }
    getFibonacci(n) {
    const arr = [0, 1];
    for (let i = 2; i < n; i++) {
        arr.push(arr[i - 1] + arr[i - 2]);
    }
    return arr.slice(0, n);
}
    
}
let u1 = new Util();
console.log(u1.getDate());
console.log(u1.getPIValue());
console.log(u1.convertC2F(0));
console.log(u1.getFibonacci(2));