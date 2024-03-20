package br.com.maratonajava.aula.Rdatas;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class LocalTimeTest {
    public static void main(String[] args) {
//        LocalDate hoje = LocalDate.now();
//        System.out.println(hoje);
//        System.out.println(LocalDate.of(1960,9,11));
//        System.out.println(LocalDate.parse("2019-02-01"));
//        System.out.println(hoje.plusDays(30));
//        System.out.println(hoje.minus(1, ChronoUnit.MONTHS));
//        System.out.println(hoje.getDayOfWeek());
//        System.out.println(hoje.getDayOfMonth());
//        System.out.println(hoje.getDayOfYear());
//        System.out.println(hoje.isLeapYear());


//        LocalTime agora = LocalTime.now();
//        System.out.println(agora);
//        System.out.println(LocalTime.of(20, 18));
//        System.out.println(LocalTime.parse("00:00:01"));
//        System.out.println(agora.plusMinutes(60));
//        System.out.println(agora.minus(40, ChronoUnit.MINUTES));
//        System.out.println(agora.getHour());

        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        System.out.println(localDateTime.plusYears(9));
//        System.out.println(LocalDateTime.of(2005,3,12,14,30));
//        System.out.println(LocalDateTime.parse("2033-03-17T20:47:07.731857800"));

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

//        Set<String> zoneIdAvailableSet = ZoneId.getAvailableZoneIds();
//        for (String s : zoneIdAvailableSet) {
//            System.out.println(s);
//        }

        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.parse("2033-03-17T20:47:07.731857800"), sp);
        System.out.println(zonedDateTime);

        ZoneOffset zoneOffset = ZoneOffset.of("+02:00");

        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, zoneOffset);
        System.out.println(offsetDateTime);

        Date date = new Date();

        Calendar c = Calendar.getInstance();

        localDateTime = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(localDateTime);

        System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));

    }
}
