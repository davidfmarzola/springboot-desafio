package com.desafiotreinamentojava.restapicrud.model;

import org.apache.tomcat.jni.Local;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
public class FuncionarioTests {
    @Test
    public void criar(){
        //Pendente
        Departamento d = new Departamento();
        d.setId(1);
        d.setId(2);
        int idDepartamento = d.getId();//2
        List<Projeto> projetoListTest = new LinkedList<Projeto>();
        //projetoListTest.add();
        //Funcionario f = new Funcionario(1,"Carlos", "123.456.789-10", LocalDate.of(12,12,2000), true, 1, 1, List.of("teste unitario", "jUnit"));
    }
}
