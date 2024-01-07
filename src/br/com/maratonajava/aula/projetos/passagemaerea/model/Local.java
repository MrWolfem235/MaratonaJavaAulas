package br.com.maratonajava.aula.projetos.passagemaerea.model;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return  endereco;
    }

    public String getendereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
