package br.com.maratonajava.aula.associacao.jogador.test;

import java.util.*;

public class TecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] pos = {"Sim!!!", "Concerteza!", "Mas é Claro!", "Provavelmente sim!", "Sem dúvidas!", "SIM!!!"};
        String[] neg = {"Não...", "Nem a pau!", "Claro que não!", "Acho que não...", "Nunca!", "NÃO..."};
        String pergunta = " ";
        ArrayList <String> respostasPositivas = new ArrayList();
        ArrayList <String> respostasNegativas = new ArrayList();
        Random rand = new Random();
        respostasPositivas.addAll(List.of(pos));
        respostasNegativas.addAll(List.of(neg));

        System.out.println("--- Software de adivinhação ---");
        System.out.println("Faça sua pergunta e eu adivinharei a resposta!!!");

        while (pergunta != ""){
            System.out.print("\n\nPergunta: ");
            pergunta = input.nextLine();
            if (pergunta.charAt(0) == ' ') {
                System.out.println(respostasPositivas.get(rand.nextInt(respostasPositivas.size()-1)));
            }else{
                System.out.println(respostasNegativas.get(rand.nextInt(respostasNegativas.size()-1)));
            }
        }
    }
}
