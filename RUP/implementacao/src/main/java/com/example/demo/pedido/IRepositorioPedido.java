package com.example.demo.pedido;

import java.util.List;

import com.example.demo.pedidorequest.PedidoRequest;

public interface IRepositorioPedido {

    public List<Pedido> getAll();

    public void criarPedido(PedidoRequest pedidoRequest);

    public void atualizarStatusPedido(Long idPedido);

    public Pedido pegarPedido(Long idPedido);

    public void apagarPedido(Long idPedido);
}