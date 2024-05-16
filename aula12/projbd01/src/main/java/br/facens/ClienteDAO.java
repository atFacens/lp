package br.facens;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAO {
    private static String url = "jdbc:mysql://localhost:3306/lp_facens";
    private static String user = "profFacens";
    private static String password = "aula";
    private static Connection connection;

    public static void criarTabelaCliente(){
        try {
            System.out.println("Tentando conectar...");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso");

            String sql = "create table tb_cliente (id int, name varchar(255), email varchar(100));";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Tabela de clientes criada com sucesso.");

            statement.close();
            connection.close();
            System.out.println("Desconectado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static boolean inserirCliente(Cliente cliente) {
        String sql = "insert into tb_cliente values(?,?,?);";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            ) {
            prepareStatement.setInt(1, cliente.getId());
            prepareStatement.setString(2, cliente.getNome());
            prepareStatement.setString(3, cliente.getEmail());
            prepareStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Erro: "  + e.getMessage());
            return false;
        }
    }

    public static Cliente buscarCliente(int id) {
        String sql = "select * from tb_cliente where id = ?;";
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            ) {
            prepareStatement.setInt(1, id);
            ResultSet resultado = prepareStatement.executeQuery();
            if(resultado.next()){
                int idCliente = resultado.getInt("id");
                String nome = resultado.getString("name");
                String email = resultado.getString("email");

                Cliente cliente = new Cliente(idCliente, nome, email);
                return cliente;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Erro: "  + e.getMessage());
            return null;
        }
    }

    // String sql = "Delete from tb_cliente where id = ?;";
    // String sql = "Update tb_cliente set email = ? where id = ?;";

}
