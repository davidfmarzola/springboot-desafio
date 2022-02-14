package com.desafiotreinamentojava.restapicrud.Controller;

import com.desafiotreinamentojava.restapicrud.repository.IProjetoRepository;
import com.desafiotreinamentojava.restapicrud.model.Projeto;
//import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    IProjetoRepository repository;

    @GetMapping() // listar
    public List<Projeto> getAllProjetos(){
        return repository.findAll();
    }

    @GetMapping("/{id}") // buscar
    public Projeto getProjetoById(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping() // criar
    public Projeto saveProjeto(@RequestBody Projeto projeto) {
        return repository.save(projeto);// Objeto não possui id, logo cria
    }

    @DeleteMapping("/{id}") // remover
    public void deleteProjeto(@PathVariable int id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}") // atualizar
    public Projeto updateProjeto(@PathVariable int id, @RequestBody Projeto projeto){
        Projeto projetoAtual  = repository.findById(id).get();
        BeanUtils.copyProperties(projeto, projetoAtual, "id");
        return repository.save(projetoAtual);// Objeto possui id, logo altera
    }

}
