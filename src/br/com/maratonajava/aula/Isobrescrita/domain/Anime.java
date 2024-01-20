package br.com.maratonajava.aula.Isobrescrita.domain;

public class Anime {
    private String nome;
    
    public Anime(String nome) {//Construtor
        this.nome = nome;
    }

    @Override//Sobreposição de toString
    public String toString (){
        return String.format("--- Anime Info ---\nNome: %s\n--- ----- ---- ---", nome);
    }

    public String getNome() {//Getters e Setters
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
