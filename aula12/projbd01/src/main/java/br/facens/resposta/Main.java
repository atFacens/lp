package br.facens.resposta;

import br.facens.Cliente;

public class Main {
    public static void main(String[] args) {

        // ClienteDAO.criarTabelaCliente();

        // Inserindo um novo cliente
        Cliente cliente = new Cliente(1, "Carlos da Silva", "carlos@email.com");

        boolean sucesso = ClienteDAO.inserirCliente(cliente);
        if (sucesso) {
            System.out.println("Cliente inserido no BD!");
        } else {
            System.out.println("Não foi possível inserir");
        }

        // Procurando o Cliente no Banco de dados
        int idProcurado = 1;
        Cliente clienteEncontrado = ClienteDAO.buscarCliente(idProcurado);

        if (clienteEncontrado != null) {
            System.out.println("Encontrei o cliente: " + clienteEncontrado);
        } else {
            System.out.println("Não encontrei o cliente com id " + idProcurado);
        }

        // Alterando o email do cliente
        int idCliente = 1;
        String novoEmail = "novo@email.com";

        sucesso = ClienteDAO.alterarEmail(idCliente, novoEmail);
        if (sucesso) {
            System.out.println("Email alterado!"); 
            Cliente clienteAlerado = ClienteDAO.buscarCliente(idProcurado);
            System.out.println(clienteAlerado);
        } else {
            System.out.println("Não foi possível alterar o e-mail");
        }

        // Apagando o cliente do BD
        sucesso = ClienteDAO.apagarCliente(idProcurado);

        if (sucesso) {
            System.out.println("Cliente apagado");
            clienteEncontrado = ClienteDAO.buscarCliente(idProcurado);

            if (clienteEncontrado == null) {
                System.out.println("O cliente não existe mais no BD");
            }
        } else {
            System.out.println("Não encontrei o cliente com id " + idProcurado);
        }
    }
}