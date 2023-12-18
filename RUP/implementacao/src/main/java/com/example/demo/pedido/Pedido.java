package com.example.demo.pedido;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // Essa anotação inclui a função getPreço
@Setter // Essa anotação inclui a função atualizarStatus, que seria o mesmo que setStatus
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String linkProduto;

    private Double preco;

    private String descricao;

    private String status;
    
    private String loginDono;
}