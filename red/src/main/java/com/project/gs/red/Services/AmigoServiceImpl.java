package com.project.gs.red.Services;

import java.util.List;

import com.project.gs.red.Entitys.Usuario;
import com.project.gs.red.Repository.RedRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmigoServiceImpl implements IAmigoService{
    @Autowired
    private RedRepository redrepository;
    

    @Override
    public List<Usuario> amigos(Long id) {
        return redrepository.amigos(id);
    }

    
}
