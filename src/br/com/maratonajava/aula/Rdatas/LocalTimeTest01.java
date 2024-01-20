package br.com.maratonajava.aula.Rdatas;

import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        //get the current time
        LocalTime currentHour = LocalTime.now();

        //set a specific time
        LocalTime thisTime = LocalTime.of(17, 34, 33);

        //getting a time by parsing a string
        String stringTime = "12:56:34";
        LocalTime parsedTime = LocalTime.parse(stringTime);

        System.out.println(currentHour);
        System.out.println(thisTime);

        //getting specifics of the time
        System.out.println("Parsed time: Original: "+parsedTime+" Modified Time + 4H30m: "+parsedTime.plusHours(4).plusMinutes(30));
        System.out.println(currentHour.getHour());
        System.out.println(currentHour.getMinute());
        System.out.println(currentHour.getSecond());
        System.out.println(currentHour.getNano());
        System.out.println(currentHour.MAX);
        System.out.println(currentHour.MIN);
    }
}
