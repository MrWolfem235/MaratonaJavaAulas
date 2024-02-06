package br.com.maratonajava.aula.Aprojetos.agenda.services;

import java.time.LocalDateTime;

import br.com.maratonajava.aula.Aprojetos.agenda.classes.Date;
import br.com.maratonajava.aula.Aprojetos.agenda.classes.Event;
import br.com.maratonajava.aula.Aprojetos.agenda.classes.Task;

public class Manager {
    
    // Creating a new event
    public Event createEvent(Date date, String title, String description, LocalDateTime eventInit, LocalDateTime eventEnd){

        //Create and return a new Event for manipulation
        return new Event(title, description, eventInit, eventEnd);
    }

    public Task createTask(Date date, String title, String description, LocalDateTime time){

        //Create and return a new Task for manipulation
        return new Task( time, title, description);
    }

    public Event modify(int date, String title, String description, LocalDateTime eventInit, LocalDateTime eventEnd){
        Event thisDate = Event.getEvents().get(date);

        //if the input value is null, keep the original
        thisDate.setTitle((title == null ? thisDate.getTitle() : title));
        thisDate.setDescription((description == null ? thisDate.getDescription() : description));
        thisDate.setEventInit((eventInit == null ? thisDate.getEventInit() : eventInit));
        thisDate.setEventEnd((eventEnd == null ? thisDate.getEventEnd() : eventEnd));

        return thisDate;
    }

    public void delete(int index){
        Event.getEvents().remove(index);
    }

}
