package com.desafiotreinamentojava.restapicrud.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "funcionario_projeto")
@Data
public class Funcionario_Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_funcionario_projeto")
    private int id;
}
