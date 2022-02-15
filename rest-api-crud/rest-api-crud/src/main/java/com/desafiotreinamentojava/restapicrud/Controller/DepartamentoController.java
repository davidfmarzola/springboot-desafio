package com.desafiotreinamentojava.restapicrud.Controller;

import com.desafiotreinamentojava.restapicrud.repository.IDepartamentoRepository;
import com.desafiotreinamentojava.restapicrud.model.Departamento;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/empresa/departamento")
public class DepartamentoController {
    @Autowired
    IDepartamentoRepository repository;

    @GetMapping() // listar
    public List<Departamento> getAllDepartamentos(){
        return repository.findAll();
    }

    @GetMapping("/{id}") // buscar
    public Departamento getDepartamentoById(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping() // criar
    public Departamento saveDepartamento(@RequestBody Departamento departamento) {
        return repository.save(departamento);// Objeto não possui id, logo cria
    }

    @DeleteMapping("/{id}") // remover
    public void deleteDepartamento(@PathVariable int id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}") // atualizar
    public Departamento updateDepartamento(@PathVariable int id, @RequestBody Departamento departamento){
        Departamento departamentoAtual  = repository.findById(id).get();
        BeanUtils.copyProperties(departamento, departamentoAtual, "id");
        return repository.save(departamentoAtual);// Objeto possui id, logo altera
    }


}
