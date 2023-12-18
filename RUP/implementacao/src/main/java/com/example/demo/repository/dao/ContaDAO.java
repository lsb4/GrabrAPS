package com.example.demo.repository.dao;

import com.example.demo.conta.Conta;

import org.springframework.data.repository.CrudRepository;

// Data Access Object
public interface ContaDAO extends CrudRepository<Conta, Long>  {
    
}