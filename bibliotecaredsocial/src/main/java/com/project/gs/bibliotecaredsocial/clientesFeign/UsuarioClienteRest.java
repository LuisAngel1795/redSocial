package com.project.gs.bibliotecaredsocial.clientesFeign;

import java.util.List;

import com.project.gs.bibliotecaredsocial.entity.Usuario;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("servicio-usuarios")
public interface UsuarioClienteRest {
    @GetMapping("/detalle/{id}")
    public Usuario detalle(@PathVariable Long id);

    @GetMapping("/listar")
    public List<Usuario> listar();
}
