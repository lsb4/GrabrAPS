package com.example.demo.controllers;

import com.example.demo.gui.Fachada;
import com.example.demo.pedido.Pedido;
import com.example.demo.pedidorequest.PedidoRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ControllerCriarPedido {

    @Autowired
    private Fachada fachada;

    @PostMapping("/criarPedido")
    public void criarPedido(@RequestBody PedidoRequest pedidoRequest) {
        fachada.criarPedido(pedidoRequest);
    }

    @GetMapping("/pedidos")
    public List<Pedido> getAllPedidos(Model model) {
        return fachada.getAllPedidos();
    }

    @DeleteMapping("/apagarPedido")
    public void apagarPedido(@RequestParam(name = "id") String idPedido) {
        Long idPedidoLong = Long.parseLong(idPedido);
        fachada.apagarPedido(idPedidoLong);
    }
}