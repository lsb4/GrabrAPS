package com.example.demo.controladores;

import com.example.demo.pedido.CadastroPedido;
import com.example.demo.pedido.Pedido;
import com.example.demo.pedidorequest.PedidoRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorPedido {

    private final CadastroPedido cadastroPedido;

    @Autowired
    public ControladorPedido(CadastroPedido cadastroPedido) {
        this.cadastroPedido = cadastroPedido;
    }

    public List<Pedido> getAll() {
        return this.cadastroPedido.getAll();
    }  

    public void apagarPedido(Long idPedido) {
        this.cadastroPedido.apagarPedido(idPedido);
    }

    public void criarPedido(PedidoRequest pedidoRequest) {
        this.cadastroPedido.criarPedido(pedidoRequest);
    }
}