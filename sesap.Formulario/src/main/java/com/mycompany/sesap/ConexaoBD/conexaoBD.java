/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesap.ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conexaoBD {
    // conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/CURRICULOS?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root1234";

    //verificando conexao 
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return conn;
    }

    // Método para fechar a conexão sem PreparedStatement
    public static void fechaConexao(Connection con) {
        if (con != null) {
            try {
                con.close();
                System.out.println("Conexão finalizada com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }

    // Método para fechar a conexão com PreparedStatement
    public static void fechaConexao(PreparedStatement ps, Connection con) {
        if (ps != null) {
            try {
                ps.close();
                System.out.println("PreparedStatement fechado com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar PreparedStatement: " + e.getMessage());
            }
        }
        if (con != null) {
            try {
                con.close();
                System.out.println("Conexão finalizada com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}
