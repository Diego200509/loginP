package com.prueba.prueba.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    private String cedula;
    private String nombre;
    private String email;
    private String password;
    private String rol;
}
