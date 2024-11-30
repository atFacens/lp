package br.facens;

import br.facens.dao.ClienteDAO;
import br.facens.model.Cliente;

public class Main {
    public static void main(String[] args) {

    //    ClienteDAO.criarTabelaCliente();
        
    //    Cliente cli = new Cliente(1, "Marcelo", "marcelo@email.com");

    //     boolean inserido = ClienteDAO.inserirCliente(cli);

    //     if(inserido) {
    //         System.out.println("Inserido com sucesso");
    //     } else {
    //         System.out.println("Não foi possível inserir");
    //     }

        Cliente cliente = ClienteDAO.buscarCliente(1);

        if(cliente != null) {
            System.out.println(cliente);
        }else {
            System.out.println("Cliente não encontrado.");
        }
        
        // boolean apagou = ClienteDAO.apagarCliente(2);

        // if(apagou) {
        //     System.out.println("Cliente apagado");
        // }else {
        //     System.out.println("Cliente não encontrado.");
        // }

    }
}