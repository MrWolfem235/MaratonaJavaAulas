package br.com.maratonajava.aula.Sformatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {

        Locale localeBR = Locale.CHINESE;
        Locale localeIT = Locale.ITALIAN;
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance(localeJP);
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeIT);
        nfa[3] = NumberFormat.getInstance();

        double number = 100_000_000.234d;

        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(number));  
        }
    }
}
