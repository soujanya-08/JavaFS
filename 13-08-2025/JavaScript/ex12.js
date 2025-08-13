let str ="Gadag"
let rev = str.split('').reverse().join('');
function checkPalindrome(){
    if(str.toLowerCase() === rev.toLowerCase()){
        console.log("Its palindrome");
    }
    else{
        console.log("Its not a palindrome");
    }
}
checkPalindrome();