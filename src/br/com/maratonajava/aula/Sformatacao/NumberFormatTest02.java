package br.com.maratonajava.aula.Sformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale localeCH = Locale.CHINA;//getting Locales instances with diferents countries
        Locale localeIT = Locale.ITALY;
        Locale localeEN = Locale.ENGLISH;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(localeEN);//making Currency NumberFormat masks by the locales
        nfa[1] = NumberFormat.getCurrencyInstance(localeCH);
        nfa[2] = NumberFormat.getCurrencyInstance(localeIT);
        nfa[3] = NumberFormat.getCurrencyInstance();

        double number = 100_000_000.234d;//setting a number for mask

        String stringNumber = "R$ 100.000.000,23";

        // for (NumberFormat numberFormat : nfa){
        //     System.out.println(numberFormat.format(number));//using all the NumberFormat masks in the number  
        // }

        try {
            System.out.println(nfa[3].parse(stringNumber));
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}

//TIP: Currency == Moeda
