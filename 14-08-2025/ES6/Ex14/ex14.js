

function login(){
    const userID = document.getElementById("userid").value;
    localStorage.setItem("userID", userID);
    console.log(`${userID} logged in`)
}
function logout(){
    const userID = document.getElementById("userid").value;
    localStorage.removeItem("userID");
    console.log(`${userID} logged out`)
}

