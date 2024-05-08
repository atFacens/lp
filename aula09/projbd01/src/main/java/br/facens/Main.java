package br.facens;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/lp_facens";
        String user = "profFacens";
        String password = "aula";

        Connection connection;

        try {
            System.out.println("Tentando conectar...");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso");

            String sql = "create table tb_cliente (id int, name varchar(255), email varchar(100));";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Tabela de clientes criada com sucesso.");

            connection.close();
            System.out.println("Desconectado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}