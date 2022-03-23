package com.project.gs.usuariosredsocial.Api;

import java.util.List;

import com.project.gs.usuariosredsocial.entitys.Usuario;
import com.project.gs.usuariosredsocial.services.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    
    @Autowired 
    private IUsuarioService iusuarioservice;


    @GetMapping("/listar")
    public List<Usuario> listar() throws InterruptedException{
        boolean ok = false;
        if(ok)
        throw new RuntimeException("no se pudo cargar el servicio");
        return iusuarioservice.findAll();
    }

    @GetMapping("/detalle/{id}")
    public Usuario detalle(@PathVariable Long id){
        return iusuarioservice.findById(id);
    }

    @PostMapping("crear")
    public Usuario crear(Usuario usuario){
        return iusuarioservice.save(usuario);
    }
}
