let images = [
"https://images.unsplash.com/photo-1519092503391-16a955fda811?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8bmF0dXJhbHxlbnwwfHwwfHx8MA%3D%3D",   
 "https://plus.unsplash.com/premium_photo-1669748156838-33fda144e8dd?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8YmVhdXRpZnVsJTIwbmF0dXJlfGVufDB8fDB8fHww",
    "https://images.unsplash.com/photo-1516475429286-465d815a0df7?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fG5hdHVyYWx8ZW58MHx8MHx8fDA%3D",
    "https://media.istockphoto.com/id/2181735944/photo/natural-mountains-landscapes.webp?a=1&b=1&s=612x612&w=0&k=20&c=kXWPxrf8Gs_2e35F31rKlguPcI2JE2dtGQ58HS0-W7c=",
    "https://images.unsplash.com/photo-1604249797259-7823b2bad625?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJlYXV0aWZ1bCUyMG5hdHVyZXxlbnwwfHwwfHx8MA%3D%3D"
];

let currentIndex = 0;
document.getElementById("galleryImage").src = images[currentIndex];
function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    document.getElementById("galleryImage").src = images[currentIndex];
}
function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    document.getElementById("galleryImage").src = images[currentIndex];
}



