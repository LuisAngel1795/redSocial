package com.project.gs.bibliotecaredsocial.services;

import java.util.List;

import com.project.gs.bibliotecaredsocial.entity.Biblioteca;

public interface IBibliotecaService {
    public List<Biblioteca> findAll();
    public Biblioteca findById(Long id);
    public Biblioteca save(Long id, Integer [] ids);
    public void deleteById(Long id);
}
