package br.com.maratonajava.aula.Rdatas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime myBirthday = LocalDateTime.of(2005, Month.MARCH, 12, 14, 32,6);

        LocalDateTime now = LocalDateTime.now();

        SimpleDateFormat sdFormat = new SimpleDateFormat("DD / MMM / YYYY - a hh:mm:ss");

        DateFormat dFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);

        long daysAlive = ChronoUnit.DAYS.between(myBirthday, now);

        long weeksAlive = ChronoUnit.WEEKS.between(myBirthday, now);

        long monthsAlive = ChronoUnit.MONTHS.between(myBirthday, now);

        System.out.println(String.format("Birthday date: %s\nDays alive: %s\nWeeks alive: %s\nMonths alive: %s", sdFormat.format(myBirthday), daysAlive, weeksAlive, monthsAlive));
    }
}
