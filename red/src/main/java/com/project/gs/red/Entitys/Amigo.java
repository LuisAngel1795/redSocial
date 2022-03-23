package com.project.gs.red.Entitys;

import java.util.List;

public class Amigo {
    Usuario usuario;
    Biblioteca biblioteca;
    List<Usuario> amigosComun;

    public int getTotalAmigosEnComun(){
        return amigosComun.size();
    }
}
