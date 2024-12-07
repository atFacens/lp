package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.facens.model.Cliente;

public class ClienteDAO {
    private static String url = "jdbc:mysql://localhost:3306/bd_lp_facens";
    private static String user = "profFacens";
    private static String password = "aula";

    public static void criarTabelaCliente() {
        Connection connection;

        try {
            System.out.println("Iniciando a conexão...");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso!");

            String sql = "create table tb_cliente (id int, name varchar(150), email varchar(100));";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            statement.close();
            connection.close();
            System.out.println("Desconectado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static boolean inserirCliente(Cliente cliente) {
        String sql = "insert into tb_cliente values(?, ?, ?)";
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, cliente.getId());
            statement.setString(2, cliente.getName());
            statement.setString(3, cliente.getEmail());

            statement.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    public static Cliente buscarCliente(int id) {
        String sql = "select * from tb_cliente where id = ?" ;
        
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                int idCliente = resultSet.getInt("id");
                String nameCliente = resultSet.getString("name");
                String emailCliente = resultSet.getString("email");

                Cliente cliente = new Cliente(idCliente, nameCliente, emailCliente);
                return cliente;
            }
            return null;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
    public static boolean apagarCliente(int id) {
        String sql = "delete from tb_cliente where id = ?" ;
        
        try (
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);

            int quantidade = statement.executeUpdate();
            if(quantidade > 0) {
                return true;
            }
            return false;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

}
