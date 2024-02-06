package br.com.maratonajava.aula.TresouceBundle.test;

import br.com.maratonajava.aula.TresouceBundle.classes.In;
import br.com.maratonajava.aula.TresouceBundle.classes.Out;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        //input string and scanner declaration
        Scanner scanner = new Scanner(System.in);
        String userInput;

        //getting the default locale Bundle
        ResourceBundle activeBundle = ResourceBundle.getBundle("text", Locale.of("pt_br"));

        //all resource bundles
        ResourceBundle ptBRBundle = ResourceBundle.getBundle("text", new Locale("pt", "br"));
        ResourceBundle itITptBRBundle = ResourceBundle.getBundle("text", new Locale("it", "IT"));
        ResourceBundle frFRBundle = ResourceBundle.getBundle("text", new Locale("fr", "FR"));
        ResourceBundle esESBundle = ResourceBundle.getBundle("text", new Locale("es", "ES"));

        //initiate conversation
        System.out.println(activeBundle.getString("ask_language"));
        userInput = In.selectStrings("pt_BR", "it_IT", "fr_FR", "es_ES");
        activeBundle = ResourceBundle.getBundle("text", Locale.of(userInput));
        Out.sleep(500);
        Out.limparTela();

        System.out.println(activeBundle.getString("init"));
        System.out.println(activeBundle.getString("hello"));
        System.out.println(activeBundle.getString("whats_your_name"));
        userInput = scanner.nextLine();
        System.out.println(activeBundle.getString("how_are_you")+ " "+ userInput);
        userInput = scanner.nextLine();
        System.out.println(activeBundle.getString("good_that_you_is")+userInput.toLowerCase().trim());
    }
}
