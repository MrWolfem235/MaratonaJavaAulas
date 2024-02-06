package br.com.maratonajava.aula.Rdatas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        
        LocalDate nextThursday = now.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));

        LocalDate lastDayOfThisMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        

        System.out.println(String.format("Actual date: %s\nNext thursday: %s\nLast day of this month: %s", now,nextThursday, lastDayOfThisMonth));
    }    
}
