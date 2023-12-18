package com.example.demo.factory;

import com.example.demo.conta.IRepositorioConta;
import com.example.demo.pedido.IRepositorioPedido;

public interface FabricaAbstrataRepositorios {
    public IRepositorioPedido criarRepositorioPedido();
    public IRepositorioConta criarRepositorioConta();
}