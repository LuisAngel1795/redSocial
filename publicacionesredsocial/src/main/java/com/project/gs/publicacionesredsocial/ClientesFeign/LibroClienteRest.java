package com.project.gs.publicacionesredsocial.ClientesFeign;

import java.util.List;

import com.project.gs.publicacionesredsocial.Entitys.Libro;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="servicio-libros")
public interface LibroClienteRest {
    @GetMapping("/libros/{ids}")
    public List<Libro> libros(@PathVariable Integer[] ids);

    @GetMapping("/librosByUser/{id}")
    public List<Libro> librosByUser(@PathVariable Long id);

    @GetMapping("/detalle/{id}")
    public Libro detalle(@PathVariable Long id);
}
