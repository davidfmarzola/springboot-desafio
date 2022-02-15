package com.desafiotreinamentojava.restapicrud.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DepartamentoTests {
    @Test
    public void criar(){
        Departamento d = new Departamento(1, "Carlos", 995451148);
        System.out.println(d);
    }
}
