package br.com.maratonajava.aula.Rdatas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalTime timeA = LocalTime.now();
        LocalTime timeB = LocalTime.now().plusHours(5);

        Duration durationA = Duration.between(timeA, timeB);

        Duration durationB = Duration.ofSeconds(1_000_000);

        Duration durationC = Duration.ofSeconds(999999);

        System.out.println(durationC);
    }
}
