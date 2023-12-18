package com.example.demo.repository.inmemory;

import com.example.demo.pedido.IRepositorioPedido;
import com.example.demo.pedido.Pedido;
import com.example.demo.pedidorequest.PedidoRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CadastroPedidoRepositoryInMemory implements IRepositorioPedido {

    private static CadastroPedidoRepositoryInMemory instance;

    public static CadastroPedidoRepositoryInMemory getInstance() {
        if (instance == null) {
            instance = new CadastroPedidoRepositoryInMemory();
        }
        return instance;
    }

    private Map<Long, Pedido> pedidos;

    public CadastroPedidoRepositoryInMemory() {
        pedidos = new HashMap<>();
        pedidos.put((long)0, new Pedido((long) 0,"inicial", 999.9, "inicial", "Aguardando", "inicial"));
        System.out.println("Contas criadas: " + pedidos.size());
    }

    @Override
    public List<Pedido> getAll() {
        return new ArrayList<>(pedidos.values());
    }

    @Override
    public void criarPedido(PedidoRequest novoPedido) {
        Pedido pedido = new Pedido();
        pedido.setId((long)(pedidos.size()));
        pedido.setLinkProduto(novoPedido.getLink());
        pedido.setPreco(novoPedido.getPreco());
        pedido.setDescricao(novoPedido.getDescricao());
        pedido.setStatus("Aguardando");
        pedido.setLoginDono(novoPedido.getLogin());
        pedidos.put((long)(pedidos.size()), pedido); // Login do usuário ou idPedido?
    }

    @Override
    public void apagarPedido(Long idPedido) {
        Pedido pedidoAlvo = pedidos.get(idPedido);

        for (Iterator<Map.Entry<Long, Pedido>> iterator = pedidos.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<Long, Pedido> entry = iterator.next();
            Pedido pedido = entry.getValue();

            if (pedido.equals(pedidoAlvo)) {
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public Pedido pegarPedido(Long idPedido) {
        return pedidos.get(idPedido);
    }

    @Override
    public void atualizarStatusPedido(Long idPedido) {
        Pedido pedido = pedidos.get(idPedido);
        pedido.setStatus("Pedido aceito");
    }

}