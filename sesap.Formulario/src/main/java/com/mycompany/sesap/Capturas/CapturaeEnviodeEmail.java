package com.mycompany.sesap.Capturas;

import com.mycompany.sesap.POO.Curriculo;
import com.mycompany.sesap.POO.Curriculo;
import com.mycompany.sesap.dao.CurriculoDAO;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import java.io.File;

public class CapturaeEnviodeEmail {
    // Tamanho máximo do arquivo
    private static final long MAX_FILE_SIZE_MB = 1;
    // Tamanho máximo do arquivo em bytes
    private static final long MAX_FILE_SIZE_BYTES = MAX_FILE_SIZE_MB * 1024 * 1024;

    public void enviar(String caminhoArquivo, String descArquivo, String nomeArquivo, Curriculo curriculo) {
        // Verifica se o arquivo atende aos critérios
        if (!isValidFile(caminhoArquivo)) {
            throw new IllegalArgumentException("O arquivo não é válido. Certifique-se de que seja .doc, .docx ou .pdf e não exceda 1MB.");
        }

        try {
            // Configuração do Gmail
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(465); // Porta SSL
            email.setSSLOnConnect(true); // Habilitar SSL
            // AQUI VOCE DEVE COLOCAR SEU EMAIL E TOKEN DE ACESSO PARA RECEBER DADO NO EMAIL CORRETAMENTE!
            email.setAuthenticator(new DefaultAuthenticator("teste@gmail.com", "//tokendeacessogmail"));

            // Configuração do remetente e destinatário
            email.setFrom("teste@gmail.com", "Sesap");
            email.addTo("teste@gmail.com");

            // Configuração do assunto e mensagem
            email.setSubject("Envio de Currículo - " + curriculo.getNome());
            String mensagem = gerarMensagemEmail(curriculo);
            email.setMsg(mensagem);

            // Anexando o arquivo
            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(caminhoArquivo);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setDescription(descArquivo);
            attachment.setName(nomeArquivo);
            email.attach(attachment);

            // Enviando o e-mail
            email.send();
            System.out.println("E-mail enviado com sucesso!");

        } catch (EmailException e) {
            System.err.println("Falha ao enviar o e-mail: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Verifica se o arquivo é válido
    private boolean isValidFile(String caminhoArquivo) {
        File file = new File(caminhoArquivo);

        // Verifica se o arquivo existe e é um arquivo válido
        if (!file.exists() || !file.isFile()) {
            System.err.println("O arquivo não existe ou não é um arquivo válido.");
            return false;
        }

        // Verifica o tamanho do arquivo
        if (file.length() > MAX_FILE_SIZE_BYTES) {
            System.err.println("O arquivo excede o tamanho máximo permitido de 1MB.");
            return false;
        }

        // Verifica a extensão do arquivo
        String fileName = file.getName().toLowerCase();
        if (!(fileName.endsWith(".doc") || fileName.endsWith(".docx") || fileName.endsWith(".pdf"))) {
            System.err.println("O arquivo não é do tipo permitido. Permitidos: .doc, .docx, .pdf.");
            return false;
        }

        return true;
    }

    // Método para gerar a mensagem do email com os dados do currículo
    private String gerarMensagemEmail(Curriculo curriculo) {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do Currículo:\n");
        sb.append("Nome: ").append(curriculo.getNome()).append("\n");
        sb.append("Email: ").append(curriculo.getEmail()).append("\n");
        sb.append("Telefone: ").append(curriculo.getTelefone()).append("\n");
        sb.append("Cargo Desejado: ").append(curriculo.getCargoDesejado()).append("\n");
        sb.append("Escolaridade: ").append(curriculo.getEscolaridade()).append("\n");
        sb.append("Observações: ").append(curriculo.getObservaçoes()).append("\n");
        sb.append("Arquivo Anexado: ").append(curriculo.getArquivo()).append("\n");
        return sb.toString();
    }
}

