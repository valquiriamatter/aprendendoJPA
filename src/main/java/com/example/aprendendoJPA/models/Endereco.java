package com.example.aprendendoJPA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // Definindo a Classe como Entidade
@Table(name = "Endereços") //Definindo o nome da Tabela
@SequenceGenerator(name = "seq_endereco", initialValue = 10, sequenceName = "seq_endereco") //Definindo Informações da Sequence
public class Endereco {

    @Id //Definindo o ID
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco") //Definindo a Estratégia de Geração como Sequence
    private Long id;
    private String logradouro;
    private String bairro;
    private String localidade;
    @Column(name = "Estado", length = 2, nullable = false) //Definindo configurações de uma Coluna
    private String uf;

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", estado='" + uf + '\'' +
                '}';
    }
}