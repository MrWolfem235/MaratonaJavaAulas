package br.com.maratonajava.aula.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {
    // \s allow all spaces
    // \S allow all except spaces
    // \d allow all digits
    // \D allow all except digits
    // \w allow all letters and numbers a-z A-Z 0-9 and _
    // \W allow all except those letters and numbers
    // range [] abrange um intervalo
    // ? zero ou um
    // * zero ou mais
    // + um ou mais
    // () agrupamento
    // | ou
    // $ fim de linha
    // . metacaractere coringa

    public static void main(String[] args) {
        String hexaRegex = "0(x|X)[a-fA-F0-9]+(\\s|$)";
        String emailRegex = "([\\w-])+@([\\w]){2,64}([\\.]([\\w]){2,64})+\\s";

        String regex = emailRegex;

        String text = " carloseduscc@gmail.com legendofzelda235@gmail.com carlos.esccavaletto@senacsp.edu.br joao*@%.7 luanzin@)(.)( débora¨¨@gmail.com";
        String index = "012345678901234567890123456789";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("search: "+ Colors.format(regex, Colors.BLUE));
        System.out.println("text:  "+ Colors.format(text, Colors.BLUE));
        System.out.println("Index: "+ Colors.format(index, Colors.BLUE));
        System.out.println("==== result: ");

        while (matcher.find()){
            System.out.printf("index: %20s found: %20s \n",  Colors.format(matcher.start(), Colors.RED),  Colors.format(matcher.group(), Colors.RED));
        }
    }
}
