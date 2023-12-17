package com.example.demo.conta;

import com.example.demo.pedido.Pedido;
import com.example.demo.conta.Conta;

import java.util.List;

public interface IRepositorioConta {

    public List<Conta> getAll();

    public boolean existe(String login);

    public void criarUsuario(String login, String senha);

    public Conta pegarConta(String login);

    public void criarPedido(String login, Pedido pedido);
}