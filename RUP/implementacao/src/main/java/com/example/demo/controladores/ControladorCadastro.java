package com.example.demo.controladores;

import com.example.demo.conta.CadastroConta;
import com.example.demo.conta.Conta;
import com.example.demo.exception.AccountAlreadyRegisteredException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorCadastro {

    private final CadastroConta cadastroConta;

    @Autowired
    public ControladorCadastro(CadastroConta cadastroConta) {
        this.cadastroConta = cadastroConta;
    }

    public void cadastrarUsuario(String login, String senha) throws AccountAlreadyRegisteredException {
        if(!cadastroConta.existe(login))
            cadastroConta.criarUsuario(login, senha);
        else
            throw new AccountAlreadyRegisteredException();
    }

    public List<Conta> getAll() {
        return cadastroConta.getAll();
    } 
}