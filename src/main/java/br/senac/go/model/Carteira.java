package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data // FAZ OS MÉTODOS GET, SET, TOSTRING , HASCODE ,EQUALS
@Entity // FALA PARA O 'ORM' GERENCIAR O ESTADO DESTE ITEM NO BANCO DE DADOS
@Table(name = "CARTEIRA") // 'NOMEA' A TABELA DO BANCO DE DADOS



public class Carteira {

    @Id // fala que esse item é chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)//auto-impremental

    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME")
    private String nome ;

    @Column(name = "DESCRICAO")
    private String descricao;

    @OneToMany(

            cascade = CascadeType.ALL,
            orphanRemoval = true ,
            fetch = FetchType.LAZY

    )
    private List<Pessoa> pessoas =new ArrayList<>();
}
