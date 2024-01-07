package br.com.maratonajava.aula.exceptions.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        System.out.println("Tro");
        recursivo();
    }

    public static void recursivo(){
        System.out.println("lo");
        recursivo();
    }
}
