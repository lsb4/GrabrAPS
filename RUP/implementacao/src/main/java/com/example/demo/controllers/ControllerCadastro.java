package com.example.demo.controllers;

import com.example.demo.conta.Conta;
import com.example.demo.exception.AccountAlreadyRegisteredException;
import com.example.demo.gui.Fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ControllerCadastro {

    @Autowired
    private Fachada fachada;

    @PostMapping("/cadastro")
    public void efetuarCadastro(@RequestParam(name = "login") String login, @RequestParam(name = "senha") String senha) throws AccountAlreadyRegisteredException {
        fachada.cadastrarConta(login, senha);
    }

    @GetMapping("/contas")
    public List<Conta> getAllContas(Model model) {
        return fachada.getAllContas();
    }
}