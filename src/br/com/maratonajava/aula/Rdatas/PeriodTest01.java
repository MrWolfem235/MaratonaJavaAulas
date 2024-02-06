package br.com.maratonajava.aula.Rdatas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate dateA = LocalDate.now();
        LocalDate dateB = LocalDate.now().plusDays(579);

        System.out.println(Period.parse("P5M"));
    }
}
