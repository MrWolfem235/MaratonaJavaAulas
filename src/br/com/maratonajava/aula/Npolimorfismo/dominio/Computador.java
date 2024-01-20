package br.com.maratonajava.aula.Npolimorfismo.dominio;

public class Computador extends Produto{
    public final double TAXA = 0.25;

    public Computador(String nome, double valor){
        super(nome, valor);
    }

    public double calcularImposto(){
        System.out.println("Calculando imposto do computador...");
        return this.getValor() * TAXA;
    }
}
