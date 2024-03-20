package br.com.maratonajava.aula.XColections.exercises.test;

import br.com.maratonajava.aula.XColections.exercises.domain.NoDuplicateList;

import java.util.Scanner;

public class NoDuplicateListTest {
    public static void main(String[] args) {
        NoDuplicateList noDuplicateList = new NoDuplicateList();
        Integer userResponse = 1;
        System.out.println("Criador de lista sem duplicatas e com ordem original!!!");


            while (true) {
                System.out.println("Digite um número: ");
                userResponse = receiveUserInteger();
                if (userResponse == null) continue;
                if (userResponse < 0) break;
                noDuplicateList.put(userResponse);
            }


        noDuplicateList.inverter();

        System.out.println(noDuplicateList.getSet());
    }

    static private Integer receiveUserInteger(){
        try {
            return new Scanner(System.in).nextInt();
        }catch (Exception e){
            System.out.println("Tente novamente!");
            return null;
        }
    }
}
