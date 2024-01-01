package br.com.maratonajava.aula.modificadorfinal.domain;

public class Comprador {
    private String nome;

    public Comprador(String nome) {
        this.nome = nome;
    }

    public Comprador() {
    }

    @Override
    public String toString() {
        return "    - Comprador Info -\n    Nome: " + nome + "\n---          ---";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
