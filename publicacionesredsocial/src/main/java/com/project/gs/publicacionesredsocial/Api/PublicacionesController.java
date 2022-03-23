package com.project.gs.publicacionesredsocial.Api;

import java.util.List;

import com.project.gs.publicacionesredsocial.Entitys.Publicacion;
import com.project.gs.publicacionesredsocial.Services.IPublicacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicacionesController {
    
    @Autowired
    private IPublicacionService ipublicacionservice;

    @GetMapping("/listar")
    public List<Publicacion> listar(){
        return ipublicacionservice.findAll();
    }
}
