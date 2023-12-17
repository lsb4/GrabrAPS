package com.example.demo.oferta;

import com.example.demo.status.Status;
import com.example.demo.conta.Conta;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter // Essa anotação inclui a função atualizarStatus, que seria o mesmo que setStatus
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    private Double taxaDoViajante;

    private Status status;
    
    private Conta ofertante;
}