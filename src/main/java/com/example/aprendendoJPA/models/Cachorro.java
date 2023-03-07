package com.example.aprendendoJPA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cachorro {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING) //Definindo um ENUM
    private Raca raca;

    @ManyToOne //Tornando o relacionamento Bidirecional
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

}
