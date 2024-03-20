package br.com.maratonajava.aula.YGenerics.test;

import br.com.maratonajava.aula.YGenerics.domain.Carro;

import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Carro> carros = returnList(new Carro("Honda"), new Carro("Chevrolet"), new Carro("Maverick"));
        System.out.println(carros);
    }

    public static <T> List<T> returnList(T... objects){
        return List.of(objects);
    }
}
