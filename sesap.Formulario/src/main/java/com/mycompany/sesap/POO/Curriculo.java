
package com.mycompany.sesap.POO;
public class Curriculo {
    
    
     //atributos do curriculo
    private int id;
    private String Nome;
    private String Email;
    private String Telefone;
    private String CargoDesejado;
    private String Escolaridade;
    private String Observaçoes;
    private String Arquivo;
    private String Data_Envio;
    private String ip;
    public String getIp() {
        return ip;
        
        // Getters e Setters
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
    public String getData_Envio() {
        return Data_Envio;
    }

    public void setData_Envio(String Data_Envio) {
        this.Data_Envio = Data_Envio;
    }
       

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCargoDesejado() {
        return CargoDesejado;
    }

    public void setCargoDesejado(String CargoDesejado) {
        this.CargoDesejado = CargoDesejado;
    }

    public String getEscolaridade() {
        return Escolaridade;
    }

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }

    public String getObservaçoes() {
        return Observaçoes;
    }

    public void setObservaçoes(String Observaçoes) {
        this.Observaçoes = Observaçoes;
    }

    public String getArquivo() {
        return Arquivo;
    }
    public void setArquivo(String Aquivo) {
        this.Arquivo = Aquivo;
    }
    
    
}

