package br.edu.infnet.springmvc.model.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static Connection conn;
    
    public static Connection abrirConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String servidor = "localhost";
            String bd = "infnet";
            String url = "jdbc:mysql://" + servidor + "/" + bd;
            String usuario = "root";
            String senha = "lpmaia";
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Banco conectado!!!!");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Erro: driver não encontrado");
        }
        catch (SQLException ex) {
            System.out.println("Erro: conexão com o BD");
        }
        return conn;
    }
    
    public static void fecharConexao() {
        
        try {
            conn.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
