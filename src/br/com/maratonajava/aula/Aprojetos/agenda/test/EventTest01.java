package br.com.maratonajava.aula.Aprojetos.agenda.test;

import java.time.LocalDateTime;
import br.com.maratonajava.aula.Aprojetos.agenda.classes.Event;

public class EventTest01 {
    public static void main(String[] args) {

        new Event("Evento teste", "Descrição evento", LocalDateTime.now() , LocalDateTime.now().plusDays(7));
        System.out.println(Event.getEvents().getLast().toString());
        new Event("Evento teste 2", "Descrição evento 2", LocalDateTime.now().minusHours(357) , LocalDateTime.now().plusHours(299));
        System.out.println(Event.getEvents().getLast().toString());


    }
}
