package com.project.gs.bibliotecaredsocial.services;

import java.util.List;
import java.util.stream.Collectors;

import com.project.gs.bibliotecaredsocial.clientesFeign.LibroClienteRest;
import com.project.gs.bibliotecaredsocial.clientesFeign.UsuarioClienteRest;
import com.project.gs.bibliotecaredsocial.entity.Biblioteca;
import com.project.gs.bibliotecaredsocial.entity.Libro;
import com.project.gs.bibliotecaredsocial.entity.Usuario;
import com.project.gs.bibliotecaredsocial.repository.BibliotecaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BibliotecaServiceImpl implements IBibliotecaService{
    
    @Autowired
    LibroClienteRest clienteLibro;

    @Autowired
    UsuarioClienteRest clienteUsuario;

    @Autowired
    BibliotecaRepository bibliotecarepository;

    @Override
    public List<Biblioteca> findAll() {    
        return clienteUsuario.listar().stream().map(u -> new Biblioteca(u,clienteLibro.librosByUser(u.getId()))).collect(Collectors.toList());           
    }

    @Override
    public Biblioteca findById(Long id) {
        
        return new Biblioteca(clienteUsuario.detalle(id),clienteLibro.librosByUser(id));
    }

    @Override
    public Biblioteca save(Long id, Integer[] ids) {
        List<Libro> libros = clienteLibro.libros(ids);
        Usuario usuario = clienteUsuario.detalle(id);
        for (Libro libro : libros) {
            bibliotecarepository.save(new Biblioteca(usuario.getId(),libro.getId()));
        }

        return new Biblioteca(usuario, libros);
    }

    @Override
    public void deleteById(Long id) {        
        
    }


}
