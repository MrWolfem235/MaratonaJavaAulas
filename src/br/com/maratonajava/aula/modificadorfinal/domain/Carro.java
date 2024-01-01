package br.com.maratonajava.aula.modificadorfinal.domain;

public class Carro {
    private String nome;
    public final static double VELOCIDADE_MAXIMA;
    public final Comprador COMPRADOR;
    
    static{
        VELOCIDADE_MAXIMA = 180;
    }

    {
        COMPRADOR = new Comprador();
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    

    @Override
    public String toString() {
        return "--- Carro Info ---\nNome: " + nome  + "\nVelocidade Máxima: "+VELOCIDADE_MAXIMA+'\n'+ COMPRADOR.toString()+"--- ---- ---- ---";
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public static double getVelocidadeMaxima() {
        return VELOCIDADE_MAXIMA;
    }

    
}
