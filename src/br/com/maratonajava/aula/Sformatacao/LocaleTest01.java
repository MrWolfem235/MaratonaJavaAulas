package br.com.maratonajava.aula.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale [] locales = new Locale[4];
        locales[0] = Locale.getDefault();
        locales[1] = Locale.CHINA;
        locales[2] = Locale.JAPANESE;
        locales[3] = Locale.ITALIAN;

        Calendar c = Calendar.getInstance();

        DateFormat[] dateFormat = new DateFormat[3]; 

        for (int i = 0 ; i < locales.length && i < dateFormat.length && locales[i] != null && dateFormat[i] != null; i++){
            dateFormat[i] = DateFormat.getDateInstance(DateFormat.FULL, locales[i]);
        }

        for (DateFormat dateFormatAux : dateFormat){
            System.out.println(dateFormatAux.format(c.getTime()));
        }
    }
}
/*
Genericamente temos um horário e criamos um formato de horário,
e então podemos formatar esses horários
formatos podem ser criados com Locale dada linguagem e país pelo código iso
horários podem ser manipulados pelo Date, Calendar e Time
*/