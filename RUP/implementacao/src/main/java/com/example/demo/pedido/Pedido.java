package com.example.demo.pedido;

import com.example.demo.status.Status;
import com.example.demo.entrega.Entrega;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter // Essa anotação inclui a função atualizarStatus, que seria o mesmo que setStatus
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    private String linkProduto;

    private Double preco;

    private String descricao;

    private Status status;

    private Entrega entrega;

    private List<Oferta> ofertas;

    public Double calcularValorFinal(){
        // 1. Procurar no array de ofertas a oferta com status de aceita
        // return this.preco + taxaDoViajante 
    }
}