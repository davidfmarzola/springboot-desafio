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
    @Column(name="id_departamento")
    private int id;

    @Column(length=60, unique = true)
    private String nome;

    @Column(unique = true)
    private int numero;

    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name="id_departamento")
    private List<Projeto> projetos;//um departamento pode ter vários projetos
}
