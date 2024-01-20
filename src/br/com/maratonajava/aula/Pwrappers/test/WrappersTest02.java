package br.com.maratonajava.aula.Pwrappers.test;

import java.util.Scanner;

public class WrappersTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String lastUserInput = null;

        while (true) {
            System.out.println("Digite algo: ");
            userInput = scanner.nextLine();
            //Quebra do looping caso entrada do usuário seja zero
            if (userInput.equals("0")){
                break;
            }
            System.out.println("Primeira Letra: "+userInput.charAt(0));
            System.out.println("Última Letra: "+userInput.charAt(userInput.length()-1));
            System.out.println("Tudo Maiúsculo: "+userInput.toUpperCase());
            System.out.println("Tudo Minúsculo: "+userInput.toLowerCase());
            System.out.println((lastUserInput != null ? ((lastUserInput.equals(userInput) ? "Igual ao último digitado":"Diferente do último digitado")) : ""));
            
            System.out.println();
            lastUserInput = userInput;
        }
        
    }
}
