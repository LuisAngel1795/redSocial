package com.project.gs.usuariosredsocial.services;

import java.util.List;

import com.project.gs.usuariosredsocial.entitys.Usuario;

public interface IUsuarioService {
    public List<Usuario> findAll();
    public Usuario findById(Long id);
    public Usuario save(Usuario usuario);
}
