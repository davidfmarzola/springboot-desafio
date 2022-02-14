package com.desafiotreinamentojava.restapicrud.repository;
import com.desafiotreinamentojava.restapicrud.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface IDepartamentoRepository extends JpaRepository<Departamento, Integer> {

}
