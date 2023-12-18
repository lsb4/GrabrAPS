package com.example.demo.pedido;

import org.springframework.stereotype.Component;

import com.example.demo.pedidorequest.PedidoRequest;

import java.util.*;

@Component
public class CadastroPedido {

    private final IRepositorioPedido repositorioPedido;

    public CadastroPedido(IRepositorioPedido repositorioPedido) {
        this.repositorioPedido = repositorioPedido;
    }

    public List<Pedido> getAll() {
        return this.repositorioPedido.getAll();
    }

    public void atualizarStatusPedido(Long idPedido) {
        this.repositorioPedido.atualizarStatusPedido(idPedido);
    }

    public Pedido pegarPedido(Long idPedido) {
        return this.repositorioPedido.pegarPedido(idPedido);
    }

    public void criarPedido(PedidoRequest pedidoRequest) {
        this.repositorioPedido.criarPedido(pedidoRequest);
    }

    public void apagarPedido(Long idPedido) {
        this.repositorioPedido.apagarPedido(idPedido);
    }
}
