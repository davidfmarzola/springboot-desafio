package com.desafiotreinamentojava.restapicrud.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "projeto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_projeto")
    private int id;

    @Column(length=60, unique = true)
    private String nome;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_departamento")//chave estrangeira
    private Departamento idDepartamento;//'n' projetos, um departamento

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinTable(name="funcionario_projeto",
            joinColumns={@JoinColumn(name="idProjeto",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="idDepartamento",
                    referencedColumnName="id")})
    private Departamento departamento;
}
