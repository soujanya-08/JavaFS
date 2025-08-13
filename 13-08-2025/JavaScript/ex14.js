let cities = ["Hubli", "Bellary", "Bangaluru", "Gadag", "Sirsi", "Vijaypur"];
let sortedCities = cities.sort();

function cityList() {
    let dropdown = document.getElementById("drp");
    
    dropdown.length = 1;

    for (let city of sortedCities) {
        let option = document.createElement("option");
        option.text = city;
        option.value = city;
        dropdown.add(option);
    }
}