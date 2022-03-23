package com.project.gs.bibliotecaredsocial.Api;

import java.util.ArrayList;
import java.util.List;

import com.project.gs.bibliotecaredsocial.entity.Biblioteca;
import com.project.gs.bibliotecaredsocial.services.IBibliotecaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BibliotecaController {

    @Autowired
    private CircuitBreakerFactory cbfactory;

    @Autowired
    private IBibliotecaService bibliotecaService;

    @GetMapping("/listar")
    public List<Biblioteca> listar(){
        List<Biblioteca> biblios;
        biblios = cbfactory.create("biblioteca").run(() -> bibliotecaService.findAll(), e -> metodoFallBack());
        return  biblios;
    }
    @GetMapping("/ver/{id}")
    public Biblioteca ver(@PathVariable Long id){
        return bibliotecaService.findById(id);
    }

    public List<Biblioteca> metodoFallBack()
    {
        List<Biblioteca> biblios = new ArrayList<>();
        biblios.add(bibliotecaService.findById(1l));
        return biblios;
    }

    @PostMapping("/crear/usuario/{id}/libros/{ids}")
    public Biblioteca crear(@PathVariable Long id, @PathVariable Integer []ids){
        return bibliotecaService.save(id, ids);
    }
}
