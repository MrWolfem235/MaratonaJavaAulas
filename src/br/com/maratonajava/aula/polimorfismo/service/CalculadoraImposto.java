package br.com.maratonajava.aula.polimorfismo.service;

import br.com.maratonajava.aula.polimorfismo.dominio.*;

public class CalculadoraImposto {
    
    public static void calcularImposto(Produto produto){
        String nome = produto.getNome();
        double valor = produto.getValor();
        double imposto = produto.calcularImposto();
        double total = valor + imposto;

        System.out.println("---- Relatório Imposto Produto ----");
        System.out.printf("produto: %s\nValor: %.2f\nTaxa a pagar: %.2f\nTotal: %.2f\n",nome, valor, imposto, total);        
    }
    /*Método que recebe uma referencia de produto que pode contem objetos
    específicos como tomate ou computador, 
    e usar seus métodos específicos */
}
