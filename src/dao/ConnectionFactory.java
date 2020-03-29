package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public Connection getConexao() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
        } catch (Exception erro) {
            throw new RuntimeException("Erro 1: " + erro);
        }
    }
}
