package com.project.gs.publicacionesredsocial.Services;

import java.util.List;

import com.project.gs.publicacionesredsocial.ClientesFeign.LibroClienteRest;
import com.project.gs.publicacionesredsocial.ClientesFeign.UsuarioClienteRest;
import com.project.gs.publicacionesredsocial.Entitys.Publicacion;
import com.project.gs.publicacionesredsocial.Repository.PublicacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicacionServiceImpl implements IPublicacionService{

    @Autowired
    private PublicacionRepository publicacionrepository;
    @Autowired
    private UsuarioClienteRest usuarioclienterest;
    @Autowired
    private LibroClienteRest libroclienterest;

    @Override
    public List<Publicacion> findAll() {
        List<Publicacion> publicaciones;
        publicaciones = (List<Publicacion>)publicacionrepository.findAll();
        for (Publicacion publicacion : publicaciones) {
            publicacion.setUsuario(usuarioclienterest.detalle(publicacion.getIdUaurio()));
            publicacion.setLibro(libroclienterest.detalle(publicacion.getIdLibro()));
        }
        return publicaciones;
    }

    @Override
    public Publicacion findById(Long id) {
        
        return null;
    }
    
}
