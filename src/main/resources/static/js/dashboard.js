/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

const API = "http://localhost:8080/api/tickets";

function show(view) {
    document.getElementById("dashboardView").style.display = "none";
    document.getElementById("ticketsView").style.display = "none";
    document.getElementById("inventarioView").style.display = "none";

    document.getElementById(view + "View").style.display = "block";
}

async function cargarDashboard() {
    const res = await fetch(API);
    const data = await res.json();

    let abiertos = 0, proceso = 0, cerrados = 0;

    data.forEach(t => {
        if (t.estado === "ABIERTO")
            abiertos++;
        if (t.estado === "EN_PROCESO")
            proceso++;
        if (t.estado === "CERRADO")
            cerrados++;
    });

    document.getElementById("abiertos").innerText = abiertos;
    document.getElementById("proceso").innerText = proceso;
    document.getElementById("cerrados").innerText = cerrados;
}

cargarDashboard();
