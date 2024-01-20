package br.com.maratonajava.aula.Npolimorfismo.test;

import br.com.maratonajava.aula.Npolimorfismo.dominio.*;
import br.com.maratonajava.aula.Npolimorfismo.service.CalculadoraImposto;

public class CalculadoraImpostoTest01 {
    public static void main(String[] args) {
    Produto produto01 = new Computador("CNU10i7", 11000);
    Produto produto02 = new Tomate("Tomate Siciliano", 10, "10/01/2024");
    Produto produto03 = new Televisao("Toshiba 3000", 250);


    CalculadoraImposto.calcularImposto(produto01);
    System.out.println("---------------------------------");
    CalculadoraImposto.calcularImposto(produto02);
    System.out.println("---------------------------------");
    CalculadoraImposto.calcularImposto(produto03);
    }
}
