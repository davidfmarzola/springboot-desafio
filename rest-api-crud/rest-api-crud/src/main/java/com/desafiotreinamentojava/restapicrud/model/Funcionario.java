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
    @Column(name="id_funcionario")
    private Integer id;

    @Column(length=60,unique = true)
    private String nome;

    @Column(length=60, unique = true)
    private String cpf;

    @Column
    private LocalDate dataNascimento;

    @Column
    private boolean sexo;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="id_funcionario")
    private Endereco endereco;


    @OneToOne // nesse caso, unique é sempre true
    @JoinColumn(nullable = false, unique = true, name = "idSupervisor")
    //@JoinColumn(nullable = false, name = "fk_funcionario_funcionario_idx")
    private Funcionario idSupervisor;
    //private Funcionario funcionarioSupervisor = new Supervisor();

//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinTable(name="funcionario_projeto",
//            joinColumns={@JoinColumn(name="idFuncionario",
//                    referencedColumnName="id")},
//            inverseJoinColumns={@JoinColumn(name="idProjeto",
//                    referencedColumnName="id")})
    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name="id_funcionario")
    private List<Projeto> projetos;//um funcionario pode estar em vários projetos

}
