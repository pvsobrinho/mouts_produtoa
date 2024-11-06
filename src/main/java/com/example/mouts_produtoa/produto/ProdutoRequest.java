package com.example.mouts_produtoa.produto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProdutoRequest {
    private String id;
    private String nome;
    private Double preco;
    private Integer quantidade;


}
