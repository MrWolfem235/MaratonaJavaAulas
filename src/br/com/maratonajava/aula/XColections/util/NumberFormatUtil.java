package br.com.maratonajava.aula.XColections.util;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatUtil {
    static public String format(double number, boolean full){
        String[] numberExtensions = {"","mi", "bi", "tri", "qua", "qui", "sex", "sep", "oct", "non", "dec"};
        String[] numberExtensionsinExtense = {"","milhões", "bilhões", "trilhões", "quadrilhões", "quintilhões", "sextilhões", "septilhões", "octilhões", "nonilhões", "decilhões"};
        String[] singularNumberExtensionsInExtense = {"", "milhão", "bilhão", "trilhão", "quadrilhão", "quintilhão", "sextilhão", "septilhão", "octilhão", "nonilhão", "decilhão"};
        int numberExtensionLevel = getNumberExtensionLevel(number);
        double abreviatedNumber = number / (Math.pow(1_000, numberExtensionLevel + 1));
        String[] selectedExtensions = full ? ((abreviatedNumber < 2) ? singularNumberExtensionsInExtense : numberExtensionsinExtense) : numberExtensions;
        String formatedNumber = NumberFormat.getInstance(Locale.getDefault()).format(abreviatedNumber);
        return formatedNumber + " " + selectedExtensions[numberExtensionLevel];
    }

    static private int getNumberExtensionLevel(double number){
        for(int i = 0;true;i++){
            if (number < 1_000_000d) return i;
            number /= 1_000d;
        }
    }
}