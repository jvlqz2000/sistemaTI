/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
const API_E = "http://localhost:8080/api/equipos";

async function cargarEquipos() {
    const res = await fetch(API_E);
    const data = await res.json();

    const tabla = document.getElementById("tablaEquipos");
    tabla.innerHTML = "";

    data.forEach(e => {
        tabla.innerHTML += `
            <tr>
                <td>${e.id}</td>
                <td>${e.nombre}</td>
                <td>${e.tipo}</td>
            </tr>
        `;
    });
}

cargarEquipos();

