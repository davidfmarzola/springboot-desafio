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

    @Column(length=60, nullable = false, unique = true)
    private String nome;

    @Column(length=60, nullable = false, unique = true)
    private String cpf;

    @Column
    private LocalDate dataNascimento;

    @Column
    private boolean sexo;

    @OneToOne
    @JoinColumn(nullable = false, unique = true, name = "idEndereco")
    //@JoinColumn(nullable = false, name = "fk_funcionario_endereco_idx", unique=true)
    private Endereco idEndereco;

    @OneToOne // nesse caso, unique é sempre true
    @JoinColumn(nullable = false, unique = true, name = "idSupervisor")
    //@JoinColumn(nullable = false, name = "fk_funcionario_funcionario_idx")
    private Funcionario idSupervisor;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="funcionario_projeto",
            joinColumns={@JoinColumn(name="idFuncionario",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="idProjeto",
                    referencedColumnName="id")})
    private List<Projeto> projetoList;//um funcionario, 'n' projetos
}
