package com.project.gs.red.Services;

import java.util.List;

import com.project.gs.red.Entitys.Usuario;

public interface IAmigoService {
    public List<Usuario> amigos(Long id);
}
