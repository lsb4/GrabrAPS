package com.example.demo.conta;

import com.example.demo.pedido.Pedido;
import com.example.demo.entrega.Entrega;
import com.example.demo.contabancaria.ContaBancaria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter // Devido a essa anotação, não preciso 'codar' os métodos getPedidos e getEntregas
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "conta")
public class Conta {
    @Id
    private String login;

    private String senha;

    private String telefone;

    private List<Pedido> pedidos;

    private List<Entrega> entregas;

    private ContaBancaria banco;

    public void aceitarOferta(){
        // Adicionar um novo pedido na lista de entregas do usuário
    }
}