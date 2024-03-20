package br.com.maratonajava.aula.XColections.test;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome1 = "João Frango";
        String nome2 = new String("João Frango");
        System.out.println(nome1.equals(nome2));
    }
}
