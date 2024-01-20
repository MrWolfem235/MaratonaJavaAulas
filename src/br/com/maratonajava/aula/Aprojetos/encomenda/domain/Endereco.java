package br.com.maratonajava.aula.Aprojetos.encomenda.domain;

import java.util.ArrayList;

public class Endereco {
    
    public static ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private String rua;
    private String cep;

    public Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    {
        enderecos.add(this);
    }

    @Override
    public String toString() {
        return "--- Endereco --- \n-Rua: " + rua + "\n-Cep: " + cep;
    }



    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
}
