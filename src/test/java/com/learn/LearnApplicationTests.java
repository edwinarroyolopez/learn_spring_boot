package com.learn;

import com.learn.model.Usuario;
import com.learn.reository.IUsuarioRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnApplicationTests {

    @Autowired
    private IUsuarioRepo repo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    public void crearUsuarioTest() {
        Usuario us = new Usuario();
        us.setId(3);
        us.setUsername("edlopezmax");
        us.setPassword(encoder.encode("abcd.1234"));
        Usuario retorno = repo.save(us);

        Assert.assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));

    }

}
