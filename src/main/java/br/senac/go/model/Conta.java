package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data // FAZ OS MÉTODOS GET, SET, TOSTRING , HASCODE ,EQUALS
@Entity // FALA PARA O 'ORM' GERENCIAR O ESTADO DESTE ITEM NO BANCO DE DADOS
@Table(name = "CONTA") // 'NOMEA' A TABELA DO BANCO DE DADOS



public class Conta {

    @Id // fala que esse item é chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)//auto-impremental

    @Column(name = "ID")
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "DATA INICIO ")
    private LocalDateTime dataInicio ;

    @Column(name = "DATA FIM ")
    private LocalDateTime dataFim ;

    @Column(name = "LIMITE DE CONTA")
    private BigDecimal limiteConta ;


    @OneToMany(

            cascade = CascadeType.ALL,
            orphanRemoval = true ,
            fetch = FetchType.LAZY

    )
    private List<TipoConta> tipoContas  =new ArrayList<>();

}
