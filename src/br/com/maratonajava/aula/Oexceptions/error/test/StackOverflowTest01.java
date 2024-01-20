package br.com.maratonajava.aula.Oexceptions.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursivo();
    }

    public static void recursivo(){
        recursivo();
    }
}

/*
 * os ditos "Errors", são lançáveis que não podem ser tratadas em tempo de execução, ou seja
 * nem adianta tentar resolver com um try e catch.
 */