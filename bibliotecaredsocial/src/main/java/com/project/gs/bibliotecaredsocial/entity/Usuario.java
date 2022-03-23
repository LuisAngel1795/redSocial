package com.project.gs.bibliotecaredsocial.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario{
    
    private Long id;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    
}