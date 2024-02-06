package br.com.maratonajava.aula.Aprojetos.validacao.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Levi Ackerman, 999, Sarada Uchiha, 180, Saitama,true, false, Itadori";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter("([,| ]+)");

        while(scanner.hasNext()){

            if (scanner.hasNextInt()){
                int integer = scanner.nextInt();
                System.out.println("Integer: "+integer);
            }else if(scanner.hasNextBoolean()){
                boolean bool = scanner.nextBoolean();
                System.out.println("Boolean: "+bool);
            }else{
                System.out.println("String: "+ scanner.next());
            }

        }
    }
}
