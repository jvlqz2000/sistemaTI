/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tickets.sistemaTI.service;

/**
 *
 * @author anton
 */

import com.tickets.sistemaTI.model.Ticket;
import com.tickets.sistemaTI.repository.TicketRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketService {

    private final TicketRepository repo;

    public TicketService(TicketRepository repo) {
        this.repo = repo;
    }

    public List<Ticket> listar() {
        return repo.findAll();
    }

    public Ticket guardar(Ticket t) {
        return repo.save(t);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}