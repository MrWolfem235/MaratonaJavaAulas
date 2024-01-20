package br.com.maratonajava.aula.Avarags.calculadora.domain;

public class Calculadora {
    public int somarArray(int[] numeros){
        int soma = 0;
        for (int aux: numeros){
            soma += aux;
        }
        return soma;
    }

    public int somarArrayArgvar(int... numeros){
        int soma = 0;
        for (int aux: numeros){
            soma += aux;
        }
        return soma;
    }
}
