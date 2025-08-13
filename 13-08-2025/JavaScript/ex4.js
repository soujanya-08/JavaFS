function fun(){
    str = document.getElementById("input").value;
    document.getElementById("lbl").innerText = (50 - str.length) + " characters remaining";
}