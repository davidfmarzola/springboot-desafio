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

    @Column(length=45, nullable = false)
    private String pais;

    @Column(length=45, nullable = false)
    private String uf;

    @Column(length=45, nullable = false)
    private String cidade;

    @Column(length=150, nullable = false)
    private String rua;

    @Column(length=45, nullable = false)
    private String cep;

}
