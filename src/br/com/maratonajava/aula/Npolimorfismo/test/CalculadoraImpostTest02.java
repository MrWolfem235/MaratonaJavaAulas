package br.com.maratonajava.aula.Npolimorfismo.test;

import br.com.maratonajava.aula.Npolimorfismo.dominio.*;;

public class CalculadoraImpostTest02 {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Ryzen 9", 3000);
        Computador computador01 = new Computador("i7", 11000);
        Produto produto02 = new Tomate("Tomate Japonês", 10, "10/1/2023");

        // System.out.println(produto01.calcularImposto());
        // System.out.println(produto02.calcularImposto());

        System.out.println(produto01.getNome());//Referência é mais genérica, feita ao Produto que não implementa ou tem como abstrata os métodos específicos do computador
        System.out.println(produto01.getValor());
        System.out.println(computador01.TAXA);//Referência é tipo computador que suporta a chamada ao método específico de computador
    }
}
