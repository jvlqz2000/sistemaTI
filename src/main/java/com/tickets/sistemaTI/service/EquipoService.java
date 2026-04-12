/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tickets.sistemaTI.service;

/**
 *
 * @author anton
 */

import com.tickets.sistemaTI.model.Equipo;
import com.tickets.sistemaTI.repository.EquipoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EquipoService {

    private final EquipoRepository repo;

    public EquipoService(EquipoRepository repo) {
        this.repo = repo;
    }

    public List<Equipo> listar() {
        return repo.findAll();
    }

    public Equipo guardar(Equipo e) {
        return repo.save(e);
    }
}