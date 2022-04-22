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
    // fica aqui pois é o projeto que terá a foreign key
    @JoinColumn(name="departamento_id")
    private Departamento departamento;//vários projetos para um único departamento

//    @ManyToOne
//    @JoinColumn(name="id_funcionario")
//    private Funcionario funcionario;
}
