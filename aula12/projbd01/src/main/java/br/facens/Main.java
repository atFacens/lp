package br.facens;

public class Main {
    public static void main(String[] args) {

        // ClienteDAO.criarTabelaCliente();
        // Cliente cliente = new Cliente(1, "Carlos da Silva", "carlos@email.com");
        // Cliente cliente = new Cliente(2, "Ana da Silva", "ana@email.com");

        // boolean sucesso = ClienteDAO.inserirCliente(cliente);
        // if(sucesso){
        //     System.out.println("Cliente inserido no BD!");
        // } else {
        //     System.out.println("Não foi possível inserir");
        // }

        int idProcurado = 3;
        Cliente clienteEncontrado = ClienteDAO.buscarCliente(idProcurado);

        if(clienteEncontrado != null){
            System.out.println("Encontrei o cliente: " + clienteEncontrado.getNome());
        } else {
            System.out.println("Não encontrei o cliente com id " + idProcurado);
        }

    }
}