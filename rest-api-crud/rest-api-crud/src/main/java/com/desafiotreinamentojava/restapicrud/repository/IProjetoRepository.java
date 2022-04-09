package com.desafiotreinamentojava.restapicrud.repository;

import com.desafiotreinamentojava.restapicrud.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjetoRepository extends JpaRepository<Projeto, Integer> {

}
