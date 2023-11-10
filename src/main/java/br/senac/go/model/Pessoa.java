package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // FAZ OS MÉTODOS GET, SET, TOSTRING , HASCODE ,EQUALS
@Entity // FALA PARA O 'ORM' GERENCIAR O ESTADO DESTE ITEM NO BANCO DE DADOS
@Table(name = "PESSOA") // 'NOMEA' A TABELA DO BANCO DE DADOS
public class Pessoa {

    @Id // fala que esse item é chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)//auto-impremental

    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME")
    private String nome ;

    @Column(name = "ENDERECO")
    private String endereco;

    @ManyToOne(fetch = FetchType.LAZY)
    private Carteira carteira;
}
