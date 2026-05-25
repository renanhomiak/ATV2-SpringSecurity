package com.homiak.atv.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_produto")
@Data

public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int preco;

}
