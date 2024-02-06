package br.com.maratonajava.aula.TresouceBundle.classes;

import java.util.Scanner;

public class In {
    
    public static Scanner userScan = new Scanner(System.in);
    private static String userResponse;

    public static int integer (){
        while (true){

            userResponse = userScan.nextLine();
            
            try {
                return Integer.parseInt(userResponse);
            } catch (NumberFormatException e) {
                Out.print("\r");
                Out.print(invalidInput());
            }
        }
    }

    public static float floating (){
        while (true){
            userResponse = userScan.nextLine();
            try {
                return Float.parseFloat(userResponse);
            } catch (NumberFormatException e) {
                Out.print("\r");
                Out.print(invalidInput());
            }
        }
    }

    public static String string (String message){
        Out.print(message);
        userResponse = userScan.nextLine();
        return userResponse;
    }

    public static String selectStrings (String... message){
        while (true){
            userResponse = userScan.nextLine();
            for (String messageAux : message){
                if (messageAux.equals(userResponse)){
                    return userResponse;
                }
            }
            Out.print(invalidInput());
            Out.print("\r");
        }
    }

    public static String string (){
        return userScan.nextLine();
    }

    private static String invalidInput (){
        return "Entrada inválida, tente novamente:";
    }
    
}