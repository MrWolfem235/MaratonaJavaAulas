package br.com.maratonajava.aula.Rdatas;

import java.time.LocalDate;
import java.time.Month;

public class LocalDataTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2005, Month.MARCH, 12);

        LocalDate atualDate = LocalDate.now();

        System.out.println(date.getYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek().getValue());
        System.out.println(date.getDayOfYear());
        System.out.println(date.isLeapYear());

        System.out.println(atualDate.isLeapYear());
    }
}
