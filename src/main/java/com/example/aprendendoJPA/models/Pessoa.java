package com.example.aprendendoJPA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Pessoa {

        @Id //Definindo o ID
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Definindo a Estratégia de Geração como Auto-Incremento
        private Long id;
        private String nome;

        @OneToOne //Definindo o Relacionamento Um para Um
        @JoinColumn(name = "fk_id_endereco") //Nomeando a FK
        private Endereco endereco;

        @OneToMany(mappedBy = "pessoa") //Definindo o Relacionamento Um para Muitos -> BIDIRECIONAL
        //UNIDIRECIONAL -> @JoinColumn(name = "pessoa_id") //Cria uma FK em Cachorros para Referenciar o Id da Pessoa e Evitar uma Terceira Tabela com o Relacionamento
        private List<Cachorro> cachorros;

        @ManyToMany //Definindo o Relcionamento Muitos para Muitos
        @JoinTable(name = "trabalhos_pessoas") //Marca Pessoa como Dona do Relacionamento e Define Informações da Coluna de União do Relacionamento
        private List<Trabalho> trabalhos;



}
