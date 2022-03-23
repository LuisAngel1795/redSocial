package com.project.gs.bibliotecaredsocial.clientesFeign;

import java.util.List;

import com.project.gs.bibliotecaredsocial.entity.Libro;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="servicio-libros")
public interface LibroClienteRest {

    @GetMapping("/libros/{ids}")
    public List<Libro> libros(@PathVariable Integer[] ids);

    @GetMapping("/librosByUser/{id}")
    public List<Libro> librosByUser(@PathVariable Long id);
}
