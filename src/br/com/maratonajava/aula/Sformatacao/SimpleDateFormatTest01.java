package br.com.maratonajava.aula.Sformatacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        
        //creating a string pattern with the codes and the date format
        String datePattern = "'Hoje é dia' dd 'de' MMMM 'de' YYYY',' EEEE";

        //Instatianting a SimpleDateFormat that accepts a personalizated string pattern
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);

        //
        System.out.println(sdf.format(new Date()));

        String stringDate = "Hoje é dia 20 de janeiro de 2024, sábado";

        try {
            System.out.println(sdf.parse(stringDate));
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
