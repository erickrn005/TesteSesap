
package com.mycompany.sesap.Capturas;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CapturadeHora {
    public static void main(String[] args) {
        // Obtendo a data e hora atual
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(formatter);
        
        System.out.println("Data e Hora Atuais: " + dataHoraFormatada);
    }
}
