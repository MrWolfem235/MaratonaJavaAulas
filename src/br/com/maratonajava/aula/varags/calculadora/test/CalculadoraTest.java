package br.com.maratonajava.aula.varags.calculadora.test;

import br.com.maratonajava.aula.varags.calculadora.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

//        int[] arrayNumeros = {17,26,32,55,4};
//        System.out.println(calc.somarArray(arrayNumeros));

//        System.out.println(calc.somarArray(new int[] {1,2,3,4,5}));

        System.out.println(calc.somarArrayArgvar(1,2,3,4,5,6,7,8));
    }
}
