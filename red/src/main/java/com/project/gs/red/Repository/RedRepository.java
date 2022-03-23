package com.project.gs.red.Repository;

import java.util.List;
import com.project.gs.red.Entitys.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RedRepository extends CrudRepository<Usuario,Long>{
    @Query(value="select u.* from usuarios u where id in" +
    "(select id_emisor from amigos where id_emisor <> :id  and id_receptor = :id "+
    "union select id_receptor  from amigos where id_emisor = :id  and id_receptor <> :id)",nativeQuery = true)
    public List<Usuario> amigos(@Param("id")Long id);
}
