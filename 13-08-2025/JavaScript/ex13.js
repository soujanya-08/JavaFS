

function login(){
    const emailValid = email();
        const passwordValid = password();

        if (emailValid && passwordValid) {
            alert("Login successful!");
        }

}
function email(){
    let inputField = document.getElementById("email-input").value.trim();
    let email_span = document.getElementById("empty-email");
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if(inputField === ""){
        email_span.textContent = "Email should not be empty";
        return false;
    }
    else if (!emailPattern.test(inputField)) {
            email_span.textContent = "Please enter a valid email address.";
            return false;
        }
    else{
        email_span.textContent = "";
        return true;
    }
   
}
function password(){
    let passwordField = document.getElementById("password").value.trim();
    let password_span = document.getElementById("empty-password");
    if(passwordField === ""){
        password_span.textContent = "Password should not be empty";
        return false;
    }
    else{
        password_span.textContent = "";
        return true;

    }

}



    function validatePassword() {
        const password = document.getElementById("password").value.trim();
        const passwordError = document.getElementById("passwordError");

        if (password === "") {
            passwordError.textContent = "Password cannot be empty.";
            return false;
        } else {
            passwordError.textContent = "";
            return true;
        }
    }
