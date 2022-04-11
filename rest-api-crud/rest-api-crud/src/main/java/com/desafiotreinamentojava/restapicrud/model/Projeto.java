package com.desafiotreinamentojava.restapicrud.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "projeto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome;

    @ManyToOne
    @JoinColumn(name="id_departamento")
    private Departamento departamento;//vários projetos para um departamento

    @ManyToOne
    @JoinColumn(name="id_funcionario")
    private Funcionario funcionario;
}
