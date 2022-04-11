package com.desafiotreinamentojava.restapicrud.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String pais;

    private String uf;

    private String cidade;

    private String rua;

    private String cep;

    @OneToOne
    private Funcionario funcionario;

}
