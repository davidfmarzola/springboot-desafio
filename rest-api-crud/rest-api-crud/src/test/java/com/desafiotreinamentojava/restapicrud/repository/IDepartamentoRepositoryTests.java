package com.desafiotreinamentojava.restapicrud.repository;

import com.desafiotreinamentojava.restapicrud.model.Departamento;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IDepartamentoRepositoryTests {
    @Autowired
    private IDepartamentoRepository iDepartamentoRepository;

    //@Test
//    public void inserir(){
//        Departamento d1 = new Departamento(
//                "Administrativo",
//                335
//        );
//
//        Departamento d2 = new Departamento(
//                "Financeiro",
//                331
//        );
//
//        iDepartamentoRepository.save(d1);
//        iDepartamentoRepository.save(d2);
//    }
}
