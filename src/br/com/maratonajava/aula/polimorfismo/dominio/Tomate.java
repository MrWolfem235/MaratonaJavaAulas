package br.com.maratonajava.aula.polimorfismo.dominio;

public class Tomate extends Produto{
    public final double TAXA = 0.06;

    public Tomate(String nome, double valor){
        super(nome, valor);
    }

    public double calcularImposto(){
        System.out.println("Calculando imposto do tomate...");
        return this.getValor() * TAXA;
    }
}
