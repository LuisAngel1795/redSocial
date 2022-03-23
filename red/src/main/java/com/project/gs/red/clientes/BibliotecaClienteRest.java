package com.project.gs.red.clientes;

import java.util.List;

import com.project.gs.red.Entitys.Biblioteca;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="servicio-biblioteca")
public interface BibliotecaClienteRest {
    
    
    
        @GetMapping("/listar")
        public List<Biblioteca> listar(); 

        @GetMapping("/ver/{id}")
        public Biblioteca detalle(@PathVariable Long id);
}
