package br.com.maratonajava.aula.Qstrings.test;

import java.util.Scanner;

public class StringsTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.trim());
        System.out.println(nome.charAt(Math.round((nome.length()-1)/2)));
        System.out.println(nome.substring(Math.round((nome.length()-1)/3), Math.round((nome.length())*2/3)));
        System.out.println(nome.replace(nome.charAt(Math.round((nome.length()-1)/2)), nome.charAt(0)));
    }
}
