package com.learn.rest;


import com.learn.model.Persona;
import com.learn.reository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class RestDemoController {

    @Autowired
    private IPersonaRepo repo;

    @GetMapping
    public List<Persona> listar(){
       return repo.findAll();
    }

    @PostMapping
    public void insertar(@RequestBody Persona p){
        repo.save(p);
    }

    @PutMapping
    public void modificar(@RequestBody Persona p){
        repo.save(p);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable Integer id){
        repo.deleteById(id);
    }
}
