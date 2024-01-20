package br.com.maratonajava.aula.Rdatas;

import java.util.Date;
import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.roll(c.HOUR, 39);//se o horário chegar ao ponto de passar o dia, o roll apenas reseta o horário sem mudar qualquer outro campo
        
        Date date = c.getTime();

        System.out.println(date);
    }
}
