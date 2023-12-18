package com.example.demo.conta;

import com.example.demo.contabancaria.ContaBancaria;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // Devido a essa anotação, não preciso 'codar' os métodos getPedidos e getEntregas
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Document(collection = "conta")
public class Conta {
    @Id
    private String login;

    private String senha;

    @OneToOne
    private ContaBancaria banco;
}