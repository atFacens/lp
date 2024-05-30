package br.facens.controller;

import br.facens.model.Cliente;
import br.facens.model.ClienteDAO;

public class ClienteController {
    public static  boolean inserirCliente(String nome, String email) {
        // if(cliente.getId() <= 0) {
        //     return false;
        // }
        Cliente novoCliente = new Cliente(0, nome, email);

        return ClienteDAO.inserirCliente(novoCliente);
    }

    public static Cliente buscarPorId(int id) {
        return ClienteDAO.buscarCliente(id);
    }
}
