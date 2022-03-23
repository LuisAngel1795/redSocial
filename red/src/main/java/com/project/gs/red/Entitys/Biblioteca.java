package com.project.gs.red.Entitys;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Biblioteca {
        private Usuario usuario;
        private List<Libro> libros;
        
        
        public int getTotalLibros(){
            return this.getLibros().size();
        }
}
