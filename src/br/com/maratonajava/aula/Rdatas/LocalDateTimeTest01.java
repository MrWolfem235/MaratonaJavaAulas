package br.com.maratonajava.aula.Rdatas;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDate;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();//getting the current time of LocalDateTime
        LocalDate aLocalDate = LocalDate.of(2005, Month.MARCH, 12);
        LocalTime aLocalTime = LocalTime.of(14, 35);
        LocalDateTime aLocalTimeJoint = aLocalTime.atDate(aLocalDate);
        LocalDateTime aLocalDateJoint = aLocalDate.atTime(aLocalTime);
        System.out.println("CurrentTime (LocalDateTime): "+currentTime);
        System.out.println("aLocalTime: "+aLocalTime);
        System.out.println("aLocalDate: "+aLocalDate);
        //a joint by aLocalTime (LocalTime) and aLocalDate (LocalDate)
        System.out.println("aLocalTimeJoin (localTime.atDate): "+aLocalTimeJoint);
        System.out.println("aLocalTimeJoin (LocalDate.atTime): "+aLocalDateJoint);
    }
}
