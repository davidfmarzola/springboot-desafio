package com.desafiotreinamentojava.restapicrud.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length=60, nullable = false, unique = true)
    private String nome;

    @Column(nullable = false, unique = true)
    private int numero;

    //@OneToMany
    //private List<Projeto> projeto;//um departamento, 'n' projetos
}
