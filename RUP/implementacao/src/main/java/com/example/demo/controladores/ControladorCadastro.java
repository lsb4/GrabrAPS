package com.example.demo.controladores;

import com.example.demo.conta.CadastroConta;
import com.example.demo.conta.IRepositorioConta;

import com.example.demo.exception.AccountAlreadyRegisteredException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorCadastro {

    private final CadastroConta cadastroConta;

    @Autowired
    public ControladorCadastro(CadastroConta cadastroConta) {
        this.cadastroConta = cadastroConta;
    }

    public void cadastrarConta(String login, String senha) throws AccountAlreadyRegisteredException {
        if(!cadastroConta.checarExistencia(login))
            cadastroConta.criarConta(login, senha);
        else
            throw new AccountAlreadyRegisteredException();
    }
}