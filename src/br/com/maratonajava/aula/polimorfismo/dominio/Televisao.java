package br.com.maratonajava.aula.polimorfismo.dominio;

public class Televisao extends Produto {

    public final double TAXA = 0.20;
    
    public Televisao(String nome, double valor){
        super(nome, valor);
    }

    public double calcularImposto(){
        System.out.println("Calculando imposto da televisão...");
        return this.getValor() * TAXA;
    }

}
