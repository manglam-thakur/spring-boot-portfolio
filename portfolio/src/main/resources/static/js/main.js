// Simple greeting effect for homepage
document.addEventListener("DOMContentLoaded", function() {
    const header = document.querySelector("header h1");
    if(header) {
        header.innerHTML += " 👋";
    }
});
