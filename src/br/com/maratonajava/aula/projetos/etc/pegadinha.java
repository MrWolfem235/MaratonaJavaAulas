package br.com.maratonajava.aula.projetos.etc;

import java.util.Random;
import java.util.Scanner;

public class pegadinha {
    public static void main(String[] args) {
        String[] yes = {"Sim", "Claro", "Com certeza"};
        String[] no = {"Não", "Claro que não", "Negativo"};
        String[] ask = {"Pode mandar mais uma: ", "Pode perguntar: ", "Vamos, pergunte novamente: ", "Me pergunte mais: "};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String userResponse = "";

        System.out.println("--- ADIVINHO ---\n\nBem vindo ao programa que adivinha suas perguntas!!!\nDeixe sua pergunta e eu adivinharei a resposta...");

        System.out.println("Se quiser parar, digite 0\n\nJá pode me perguntar:");

        while (true){
            userResponse = scanner.nextLine();
            if (userResponse.equals("0")){
                break;
            }
            System.out.println();//pula linha
            if (userResponse.charAt(0) == ' ') {
                System.out.println(yes[random.nextInt(yes.length)]);
            }else{
                System.out.println(no[random.nextInt(no.length)]);
            }
            System.out.println();
            System.out.println(ask[random.nextInt(ask.length)]);
        }
        System.out.println("--- OBRIGADO POR JOGAR ---");
    }
}
