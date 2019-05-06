package com.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
import com.learn.service.IPersonaService;
import com.learn.service.PersonaServiceImpl;
*/

@SpringBootApplication
public class LearnApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(LearnApplication.class);
    //@Autowired
   // private IPersonaService service;
    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /* System.out.prinln("Hello Coders from Spring boot"); */
         LOG.info("Hello Coders from Spring Boot in console");
        // LOG.warn("Advertence for Coders");
        //service.registrar("Steve Jobs");
    }


}
/*
    https://www.youtube.com/watch?v=sLY9umEahso
*/