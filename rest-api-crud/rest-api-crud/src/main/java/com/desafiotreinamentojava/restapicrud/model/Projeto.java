package com.desafiotreinamentojava.restapicrud.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "projeto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length=60, nullable = false, unique = true)
    private String nome;

    @ManyToOne
    @JoinColumn(nullable = false, name = "idDepartamento")//chave estrangeira
    private Departamento idDepartamento;//'n' projetos, um departamento

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinTable(name="funcionario_projeto",
            joinColumns={@JoinColumn(name="idProjeto",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="idFuncionario",
                    referencedColumnName="id")})
    private Funcionario funcionario;

}
