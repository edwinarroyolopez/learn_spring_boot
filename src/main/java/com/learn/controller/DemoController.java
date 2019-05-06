package com.learn.controller;

import com.learn.model.Persona;
import com.learn.reository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @Autowired
   // @Qualifier("persona1")
    private IPersonaRepo repo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model){
        /* Logica --> La logica va dentro de service */
        Persona p = new Persona();
        p.setUser_id(2);
        p.setName("Zero");

        repo.save(p);

        model.addAttribute("name",name);
        return "greeting";
    }

    @GetMapping("/listar")
    public String greeting(Model model){
        /* Logica  */
        model.addAttribute("personas",repo.findAll());
        return "greeting";
    }
}

/* https://spring.io/tools */