package com.project.gs.usuariosredsocial.services;

import java.util.List;

import com.project.gs.usuariosredsocial.entitys.Usuario;
import com.project.gs.usuariosredsocial.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImp implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuariorepository;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        
        return (List<Usuario>)usuariorepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Long id) {
        
        return usuariorepository.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuariorepository.save(usuario);
    }
    
}
