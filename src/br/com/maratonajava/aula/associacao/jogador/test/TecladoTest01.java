package br.com.maratonajava.aula.associacao.jogador.test;

import java.util.Scanner;

public class TecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Registro ---");
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("\nDigite sua idade: ");
        int idade = input.nextInt();

        System.out.print("\nDigite seu sexo [M / F]: ");
        char sexo = input.next().charAt(0);

        String info = String.format("\n--- Dados ---\nNome: %s\nIdade: %d\nSexo: %c\n--- ---- ---",nome, idade, sexo);

        System.out.println(info);
    }
}
