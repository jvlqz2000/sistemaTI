/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tickets.sistemaTI.model;

/**
 *
 * @author anton
 */
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;

    @Enumerated(EnumType.STRING)
    private EstadoEquipo estado;

    @ManyToOne
    private Usuario usuario;
}