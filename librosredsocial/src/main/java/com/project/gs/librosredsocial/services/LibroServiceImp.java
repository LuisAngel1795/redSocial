package com.project.gs.librosredsocial.services;

import java.util.List;

import com.project.gs.librosredsocial.entitys.Libro;
import com.project.gs.librosredsocial.repository.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServiceImp implements ILibroService{
    
    @Autowired
    private LibroRepository librorepository;

    @Override
    @Transactional(readOnly = true)
    public List<Libro> findAll() {
        
        return (List<Libro>)librorepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Libro findById(Long id) {
        
        return librorepository.findById(id).orElse(null);
    }

    @Override
    public Libro save(Libro libro) {
        
        return librorepository.save(libro);
    }

    @Override
    @Transactional
    public List<Libro> findLibrosById(Integer[] ids){
        return librorepository.findLibrosById(ids);
    }

    @Override
    @Transactional
    public List<Libro> findLibrosByUsuario(Integer id) {
        
        return librorepository.findLibrosByUsuario(id);
    }

    @Override
    public void deleteById(Long id) {
        librorepository.deleteById(id);
    }
    

    
}
