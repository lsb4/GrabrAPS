package com.example.demo.factory.impl;

import com.example.demo.factory.FabricaAbstrataRepositorios;
import com.example.demo.repository.inmemory.CadastroContaRepositoryInMemory;
import com.example.demo.repository.inmemory.CadastroPedidoRepositoryInMemory;
import com.example.demo.conta.IRepositorioConta;
import com.example.demo.pedido.IRepositorioPedido;
import org.springframework.stereotype.Component;

@Component
public class FabricaRepositoriosInMemory implements FabricaAbstrataRepositorios {

    @Override
    public IRepositorioPedido criarRepositorioPedido() {
        return CadastroPedidoRepositoryInMemory.getInstance();
    }

    @Override
    public IRepositorioConta criarRepositorioConta() {
        System.out.println("Criando repositorio de conta");
        return CadastroContaRepositoryInMemory.getInstance();
    }
}