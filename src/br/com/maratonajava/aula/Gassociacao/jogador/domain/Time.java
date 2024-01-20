package br.com.maratonajava.aula.Gassociacao.jogador.domain;

public class Time {
    private String nome;
    private Jogador jogadores[];

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador... jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
        for (Jogador jogador : jogadores) {
            jogador.setTime(this);
        }
    }

    public String info() {
        String info = getNome() + "\n";
        for (Jogador jogador : jogadores) {
            info += jogador.getNome() + "\n";
        }
        return info;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;


    }
}
