package br.com.maratonajava.aula.modificadorfinal.test;

import br.com.maratonajava.aula.modificadorfinal.domain.*;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Honda Fit");
        Carro c2 = new Carro("Ferrari");

        c1.COMPRADOR.setNome("João Fernandes Almeida");
        c2.COMPRADOR.setNome("João Fernandes");

        Ferrari c3 = new Ferrari("Enzo");

        System.out.println(c3.toString());
    }
    
}
