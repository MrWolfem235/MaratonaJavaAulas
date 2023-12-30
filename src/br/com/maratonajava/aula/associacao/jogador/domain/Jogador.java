package br.com.maratonajava.aula.associacao.jogador.domain;

public class Jogador {
    private String nome;
    private Time time;

    public String info(){
        return getNome()+(time != null ? " "+getTime().getNome():"");
    }

    public Jogador(String nome){
        setNome(nome);
    }

    public Jogador(String nome, Time time){
        setNome(nome);
        setTime(time);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
