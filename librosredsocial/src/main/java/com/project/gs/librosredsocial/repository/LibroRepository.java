package com.project.gs.librosredsocial.repository;

import java.util.List;

import com.project.gs.librosredsocial.entitys.Libro;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LibroRepository extends CrudRepository<Libro,Long>{
    
    @Query(value = "select * from libros where id in (:ids)", nativeQuery = true)
    public List<Libro> findLibrosById(@Param("ids") Integer[] ids);

    @Query(value="select l.* from biblioteca b join libros l on b.id_libro = l.id where b.id_usuario = :id", nativeQuery = true)
    public List<Libro> findLibrosByUsuario(@Param("id") Integer id);
}
