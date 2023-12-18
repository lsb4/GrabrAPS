package com.example.demo.pedidorequest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PedidoRequest {
    private String login;
    private String link;
    private String descricao;
    private double preco;
}
