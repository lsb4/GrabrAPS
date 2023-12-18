package com.example.demo.repository.inmemory;

import com.example.demo.conta.Conta;
import com.example.demo.conta.IRepositorioConta;
import com.example.demo.contabancaria.ContaBancaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class CadastroContaRepositoryInMemory implements IRepositorioConta {

        private static CadastroContaRepositoryInMemory instance;

        public static CadastroContaRepositoryInMemory getInstance() {
            if (instance == null) {
                instance = new CadastroContaRepositoryInMemory();
            }
            return instance;
        }

        private Map<String, Conta> contas;

        public CadastroContaRepositoryInMemory() {
            contas = new HashMap<>();
            contas.put("teste1", new Conta("inicial", "inicial", new ContaBancaria()));
        }

        @Override
        public List<Conta> getAll() {
            return new ArrayList<>(contas.values());
        }

        @Override
        public boolean existe(String login) {
            return contas.get(login) != null;
        }

        @Override
        public void criarUsuario(String login, String senha) {
            Conta conta = new Conta();
            conta.setLogin(login);
            conta.setSenha(senha);
            conta.setBanco(new ContaBancaria());
            contas.put(login, conta);
        }

        @Override
        public Conta pegarConta(String login) {
            return contas.get(login);
        }

}