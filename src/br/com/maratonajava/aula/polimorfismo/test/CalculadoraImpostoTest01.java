package br.com.maratonajava.aula.polimorfismo.test;

import br.com.maratonajava.aula.polimorfismo.dominio.*;
import br.com.maratonajava.aula.polimorfismo.service.CalculadoraImposto;

public class CalculadoraImpostoTest01 {
    public static void main(String[] args) {
    Produto produto01 = new Computador("CNU10i7", 11000);
    Produto produto02 = new Tomate("Tomate Siciliano", 10);
    Produto produto03 = new Televisao("Toshiba 3000", 250);


    CalculadoraImposto.calcularImposto(produto01);
    System.out.println("---------------------------------");
    CalculadoraImposto.calcularImposto(produto02);
    System.out.println("---------------------------------");
    CalculadoraImposto.calcularImposto(produto03);
    }
}
