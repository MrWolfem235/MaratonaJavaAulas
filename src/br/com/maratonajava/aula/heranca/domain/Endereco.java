package br.com.maratonajava.aula.heranca.domain;

public class Endereco {
    private String cep;
    private String rua;
    
    public Endereco(String cep, String rua) {
        this.cep = cep;
        this.rua = rua;
    }

    public String toString(){
        return "endereco{ cep= "+this.cep+", rua= "+this.rua+"}";
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
