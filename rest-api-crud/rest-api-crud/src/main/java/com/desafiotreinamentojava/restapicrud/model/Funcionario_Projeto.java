package com.desafiotreinamentojava.restapicrud.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "funcionario_projeto")
@Data
public class Funcionario_Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
