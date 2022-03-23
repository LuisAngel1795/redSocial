package com.project.gs.publicacionesredsocial.Services;

import java.util.List;

import com.project.gs.publicacionesredsocial.Entitys.Publicacion;

public interface IPublicacionService {
    public List<Publicacion> findAll();
    public Publicacion findById(Long id);
}
