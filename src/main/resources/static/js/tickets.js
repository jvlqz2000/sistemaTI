/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
const API_T = "http://localhost:8080/api/tickets";

async function cargarTickets() {
    const filtro = document.getElementById("filtro").value;
    const res = await fetch(API_T);
    let data = await res.json();

    if (filtro) {
        data = data.filter(t => t.estado === filtro);
    }

    const tabla = document.getElementById("tablaTickets");
    tabla.innerHTML = "";

    data.forEach(t => {
        let badge = "";

        if (t.estado === "ABIERTO")
            badge = "badge-abierto";
        if (t.estado === "EN_PROCESO")
            badge = "badge-proceso";
        if (t.estado === "CERRADO")
            badge = "badge-cerrado";

        tabla.innerHTML += `
            <tr>
                <td>${t.id}</td>
                <td>${t.titulo}</td>
                <td><span class="badge ${badge}">${t.estado}</span></td>
                <td>
                    <button onclick="cambiarEstado(${t.id})" class="btn btn-warning btn-sm">Cambiar</button>
                </td>
            </tr>
        `;
    });
}

async function cambiarEstado(id) {
    await fetch(API_T, {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({
            id: id,
            estado: "EN_PROCESO"
        })
    });

    cargarTickets();
}

