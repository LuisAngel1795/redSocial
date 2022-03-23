package com.project.gs.librosredsocial.services;

import java.util.List;

import com.project.gs.librosredsocial.entitys.Libro;

public interface ILibroService{
    public List<Libro> findAll();
    public Libro findById(Long id);
    public Libro save(Libro libro);
    public List<Libro> findLibrosById(Integer[] ids);
    public List<Libro> findLibrosByUsuario(Integer id);
    public void deleteById(Long id);
}
