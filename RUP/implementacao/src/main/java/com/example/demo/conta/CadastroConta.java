package com.example.demo.conta;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CadastroConta {

    private final IRepositorioConta repositorioConta;

    public CadastroConta(IRepositorioConta repositorioConta) {
        this.repositorioConta = repositorioConta;
    }

    public List<Conta> getAll() {
        return this.repositorioConta.getAll();
    }

    public boolean existe(String login) {
        return this.repositorioConta.existe(login);
    }

    public void criarUsuario(String login, String senha) {
        this.repositorioConta.criarUsuario(login, senha);
    }

    public Conta pegarConta(String login) {
        return this.repositorioConta.pegarConta(login);
    }
}