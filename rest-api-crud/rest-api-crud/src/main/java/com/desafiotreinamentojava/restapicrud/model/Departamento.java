package com.desafiotreinamentojava.restapicrud.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departamento")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome;

    private int numero;

    @OneToMany
    @JoinColumn(name="id_funcionario")
    private List<Projeto> projetos;//um departamento pode ter vários projetos
}
