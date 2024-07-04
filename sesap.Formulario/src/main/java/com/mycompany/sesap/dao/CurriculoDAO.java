
package com.mycompany.sesap.dao;

import com.mycompany.sesap.POO.Curriculo;
import java.sql.Connection;
import com.mycompany.sesap.ConexaoBD.conexaoBD;
import com.mycompany.sesap.Capturas.CapturadeIp;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class CurriculoDAO {
        // Alocando nas variaveis e formando
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(formatter);
        
    
    public void inserir(Curriculo c) {
        Connection con = conexaoBD.getConnection();
        PreparedStatement ps = null;
        

        try {
               
             String ip = CapturadeIp.getLocalIPAddress();
            
            String sql = "INSERT INTO CURRICULOS (Nome, Email, Telefone, CargoDesejado, Escolaridade, Observaçoes, Arquivo, Data_Envio, ip) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getEmail());
            ps.setString(3, c.getTelefone());
            ps.setString(4, c.getCargoDesejado());
            ps.setString(5, c.getEscolaridade());
            ps.setString(6, c.getObservaçoes());
            ps.setString(7, c.getArquivo());
            ps.setString(8, dataHoraFormatada);
            ps.setString(9, ip);
          

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Currículo enviado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao enviar o currículo: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexaoBD.fechaConexao(ps, con);
        }
    }
    }

   
