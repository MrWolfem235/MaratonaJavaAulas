package br.com.maratonajava.aula.Pwrappers.test;

import java.util.Scanner;

public class WrappersTest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1;
        String string2;

        while (true){
            System.out.println("Digite algo: ");
            string1 = scanner.nextLine();
            System.out.println("Digite novamente: ");
            string2 = scanner.nextLine();

            if (string1.toLowerCase().contains(string2.toLowerCase())){
                System.out.println("A palavra "+string2+" está em "+string1);
            }else{
                System.out.println("A palavra "+string2+" não está em "+string1);
            }
        }
    }
}
