package com.learn.reository;

import com.learn.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/* teoría de genéricos */
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

   Usuario findByUsername(String username);

}
