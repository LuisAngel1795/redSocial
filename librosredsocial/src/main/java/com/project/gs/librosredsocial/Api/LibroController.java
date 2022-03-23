package com.project.gs.librosredsocial.Api;

import java.util.List;

import com.project.gs.librosredsocial.entitys.Libro;
import com.project.gs.librosredsocial.services.ILibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibroController {
    @Autowired 
    private ILibroService ilibroservice;

    @GetMapping("/listar")
    public List<Libro> listar(){
        return ilibroservice.findAll();
    }

    @GetMapping("/detalle/{id}")
    public Libro detalle(@PathVariable Long id){
        return ilibroservice.findById(id);
    }

    @GetMapping("/libros/{ids}")
    public List<Libro> libros(@PathVariable Integer[] ids){
        return ilibroservice.findLibrosById(ids);
    }

    @GetMapping("/librosByUser/{id}")
    public List<Libro> librosByUser(@PathVariable Integer id){
        return ilibroservice.findLibrosByUsuario(id);
    }

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Libro crear(@RequestBody Libro libro){
        return ilibroservice.save(libro);
    }
    @PutMapping("/editar/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Libro editar(@RequestBody Libro libro, @PathVariable Long id)
    {
        Libro libroN = ilibroservice.findById(id);
        libroN.setAutor(libro.getAutor());
        libroN.setNombre(libro.getNombre());
        libroN.setAñoPublicacion(libro.getAñoPublicacion());
        return ilibroservice.save(libroN);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        ilibroservice.deleteById(id);
    }


}
