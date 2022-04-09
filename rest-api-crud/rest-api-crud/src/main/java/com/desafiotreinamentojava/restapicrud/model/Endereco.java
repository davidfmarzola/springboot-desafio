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
    @Column(name="id_endereco")
    private int id;

    @Column(length=45)
    private String pais;

    @Column(length=45)
    private String uf;

    @Column(length=45)
    private String cidade;

    @Column(length=150, nullable = true)
    private String rua;

    @Column(length=45)
    private String cep;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="id_endereco")
    private Funcionario funcionario;

}
