package br.com.maratonajava.aula.Aprojects.agenda.test;

import br.com.maratonajava.aula.Aprojects.agenda.classes.Event;

import java.time.LocalDateTime;
import java.time.Month;

public class ClassesTest01 {
    public static void main(String[] args) {
        Event thisEvent = new Event("Maratona Java", "Curso de java para iniciantes!", LocalDateTime.of(2023, Month.OCTOBER, 20, 0, 0, 0), LocalDateTime.now());

        System.out.println(thisEvent.toString());

        thisEvent.delete();

        System.out.println(thisEvent.toString());
    }
}
