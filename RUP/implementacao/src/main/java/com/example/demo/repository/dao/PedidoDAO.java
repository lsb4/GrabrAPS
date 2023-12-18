package com.example.demo.repository.dao;

import com.example.demo.pedido.Pedido;

import org.springframework.data.repository.CrudRepository;

// Data Access Object
public interface PedidoDAO extends CrudRepository<Pedido, Long>  {
    
}