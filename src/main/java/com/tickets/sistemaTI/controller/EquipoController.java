/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tickets.sistemaTI.controller;

/**
 *
 * @author anton
 */
import com.tickets.sistemaTI.model.Equipo;
import com.tickets.sistemaTI.service.EquipoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/equipos")
@CrossOrigin
public class EquipoController {

    private final EquipoService service;

    public EquipoController(EquipoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Equipo> listar() {
        return service.listar();
    }

    @PostMapping
    public Equipo crear(@RequestBody Equipo e) {
        return service.guardar(e);
    }
}