/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tickets.sistemaTI.controller;

/**
 *
 * @author anton
 */
import com.tickets.sistemaTI.model.Ticket;
import com.tickets.sistemaTI.service.TicketService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin
public class TicketController {

    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ticket> listar() {
        return service.listar();
    }

    @PostMapping
    public Ticket crear(@RequestBody Ticket t) {
        return service.guardar(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}