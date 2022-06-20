package com.example.aprendendoJPA.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @ManyToMany(mappedBy = "trabalhos")
    private List<Pessoa> funcionarios;


}
