package com.example.demo.gui;

import com.example.demo.conta.Conta;
import com.example.demo.controladores.*;
import com.example.demo.exception.AccountAlreadyRegisteredException;
import com.example.demo.pedido.Pedido;
import com.example.demo.pedidorequest.PedidoRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fachada {

    private final ControladorCadastro controladorCadastro;
    private final ControladorLogin controladorLogin;
    private final ControladorPedido controladorPedido;

    @Autowired
    public Fachada(ControladorCadastro controladorCadastro, ControladorLogin controladorLogin, ControladorPedido controladorPedido) {
        this.controladorCadastro = controladorCadastro;
        this.controladorLogin = controladorLogin;
        this.controladorPedido = controladorPedido;
    }

    public List<Conta> getAllContas() {
        return controladorCadastro.getAll();
    }

    public void cadastrarConta(String login, String senha) throws AccountAlreadyRegisteredException {
        controladorCadastro.cadastrarUsuario(login, senha);
    }
    
    public boolean efetuarLogin(String login, String senha) {
        return controladorLogin.efetuarLogin(login, senha);
    }

    public List<Pedido> getAllPedidos() {
        return controladorPedido.getAll();
    }

    public void criarPedido(PedidoRequest pedidoRequest){
        controladorPedido.criarPedido(pedidoRequest);;
    }

    public void apagarPedido(Long idPedido){
        controladorPedido.apagarPedido(idPedido);;
    }
}