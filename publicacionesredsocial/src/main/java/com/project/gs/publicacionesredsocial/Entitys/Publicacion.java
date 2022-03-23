package com.project.gs.publicacionesredsocial.Entitys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="posts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Publicacion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String contenido;
    @Column(name="fecha_creacion")
    private Date createdAt;
    @Column(name="id_autor")
    private Long idUaurio;
    @Column(name="id_libro")
    private Long idLibro;
    @Transient
    private Usuario usuario;
    @Transient
    private Libro libro;
}
