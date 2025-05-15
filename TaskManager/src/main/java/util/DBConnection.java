package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	
    private static final String URL = "private static final String URL = \"jdbc:mysql://localhost:3306/taskdb?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true\";";
    private static final String USER = "root";
    private static final String PASSWORD = "H0ll0w1@"; 

    static {
        try {
            // Registra o driver explicitamente
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver JDBC registrado com sucesso!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Falha ao registrar o driver JDBC", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        System.out.println("Tentando conectar ao banco...");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Conexão estabelecida com sucesso!");
        return conn;
    }
    
    // Método para testar a conexão
    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Teste de conexão bem-sucedido!");
        } catch (SQLException e) {
            System.err.println("Erro na conexão:");
            e.printStackTrace();
        }
    }
}