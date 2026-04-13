/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
function login() {
    const email = document.getElementById("email").value;

    // Simulación (puedes conectar a backend después)
    localStorage.setItem("user", email);

    window.location.href = "dashboard.html";
}

