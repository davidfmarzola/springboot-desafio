package com.desafiotreinamentojava.restapicrud.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "funcionario_projeto")
public class Funcionario_Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
