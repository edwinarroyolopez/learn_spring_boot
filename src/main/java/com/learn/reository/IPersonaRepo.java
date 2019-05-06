package com.learn.reository;

import com.learn.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/* teoría de genéricos */
public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

   // void registrar(String nombre);
}
