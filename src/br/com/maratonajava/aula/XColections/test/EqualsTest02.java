package br.com.maratonajava.aula.XColections.test;

import br.com.maratonajava.aula.XColections.domain.Carro;

public class EqualsTest02 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", 1990);
        Carro carro2 = carro1;

        System.out.println(carro1.equals(carro2));
    }
}
