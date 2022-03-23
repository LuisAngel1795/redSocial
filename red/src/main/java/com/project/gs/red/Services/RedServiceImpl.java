package com.project.gs.red.Services;

import com.project.gs.red.Entitys.Red;
import com.project.gs.red.Repository.RedRepository;
import com.project.gs.red.clientes.BibliotecaClienteRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedServiceImpl implements IRedService{
    
    @Autowired
    RedRepository redrepository;

    @Autowired
    BibliotecaClienteRest bibliotecaclienterest;

    @Override
    public Red findById(Long id) {
        
        return new Red(bibliotecaclienterest.detalle(id),redrepository.amigos(id));
    }


}
