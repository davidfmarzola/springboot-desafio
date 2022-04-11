package com.desafiotreinamentojava.restapicrud.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "funcionario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String cpf;

    private LocalDate dataNascimento;

    private boolean sexo;

    @OneToOne
    private Endereco endereco;

    @OneToMany
    @JoinColumn(name="id_funcionario")
    private List<Projeto> projetos;//um funcionario pode estar em vários projetos

}
