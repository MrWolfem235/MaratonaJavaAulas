package br.com.maratonajava.aula.modificadorfinal.test;

import br.com.maratonajava.aula.modificadorfinal.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Honda Fit");
        Carro c2 = new Carro("Ferrari");

        c1.COMPRADOR.setNome("João Fernandes Almeida");
        c2.COMPRADOR.setNome("João Fernandes");

        System.out.println(c1.toString());
        System.out.println();
        System.out.println(c2.toString());
    }
    
}
