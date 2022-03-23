package com.project.gs.bibliotecaredsocial.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="biblioteca")
public class Biblioteca {
@Id
@GeneratedValue(generator = "uuid2")
@GenericGenerator(name = "uuid2", strategy = "uuid2")
@Column(length = 36)
private String id;
    @Transient
    private Usuario usuario;
    @Transient
    private List<Libro> libros;
    @Column(name="id_usuario")
    private Long idUsuario;
    @Column(name="id_libro")
    private Long idLibro;

    public Biblioteca(Long idUsuario,Long idLibro) {
        this.idUsuario = idUsuario;
        this.idLibro = idLibro;
    }



    public Biblioteca(Usuario usuario, List<Libro> libros) {
        this.usuario = usuario;
        this.libros = libros;
    }



    public int getTotalLibros(){
        return this.getLibros().size();
    }
}
