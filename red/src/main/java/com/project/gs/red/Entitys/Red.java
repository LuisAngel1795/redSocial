package com.project.gs.red.Entitys;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Red {
    Biblioteca biblioteca;
    List<Usuario> amigos;

    public int getTotalAmigos(){
        return amigos.size();
    }
}
