package com.project.gs.red.Entitys;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    private Long id;
    private String nombre;
    private String Autor;
    private Date añoPublicacion;
}