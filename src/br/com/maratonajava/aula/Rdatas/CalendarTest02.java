package br.com.maratonajava.aula.Rdatas;

import java.util.Calendar;

public class CalendarTest02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Calendar d = Calendar.getInstance();

        c.add(c.HOUR, 127);
        int year = c.get(c.YEAR);
        int month = c.get(c.MONTH);
        int day = c.get(c.DAY_OF_MONTH);
        int hour = c.get(c.HOUR);
        int minute = c.get(c.MINUTE);
        int second = c.get(c.SECOND);
        System.out.println("Data: \nAno: "+year+"\nMês: "+(month+1)+"\nDia: "+day+"\nHoras: "+hour+":"+minute+":"+second);
        System.out.println();
        month = d.get(d.MONTH);
        day = d.get(d.DAY_OF_MONTH);
        hour = d.get(d.HOUR);
        minute = d.get(d.MINUTE);
        second = d.get(d.SECOND);
        System.out.println("Data: \nAno: "+year+"\nMês: "+(month+1)+"\nDia: "+day+"\nHoras: "+hour+":"+minute+":"+second);
    }
}

/*A classe Calendar é a sucessora da classe Date, e contém mais funcionalidades
*para usar seus recursos é necessária uma instância obtida pelo .getInstace();
*seus métodos recebem como parâmetros para identificar mes, dia, hora ou ano
*por enums padrão que representam inteiros, como YEAR, HOUR e etc
*tais métodos como get, add, roll são possíveis
*/