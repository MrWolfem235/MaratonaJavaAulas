package br.com.maratonajava.aula.Aprojects.agenda.classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Event extends Date{
    private static ArrayList<Event> events = new ArrayList<Event>();
    private LocalDateTime eventInit;
    private LocalDateTime eventEnd;

    public Event(String title, String description, LocalDateTime eventInit, LocalDateTime eventEnd) {
        super(title, description);
        this.eventInit = eventInit;
        this.eventEnd = eventEnd;
        this.dataOfEventCreation = LocalDateTime.now();

        //in creation, auto add this to list
        events.add(this);
    }

    public Event modify(int Date, String title, String description, LocalDateTime eventInit, LocalDateTime eventEnd){

        //if the input value is null, keep the original
        this.setTitle((title == null ? this.getTitle() : title));
        this.setDescription((description == null ? this.getDescription() : description));
        this.setEventInit((eventInit == null ? this.getEventInit() : eventInit));
        this.setEventEnd((eventEnd == null ? this.getEventEnd() : eventEnd));

        return this;
    }

    @Override
    public boolean delete() {
        return events.remove(this);
    }

    @Override
    public String toString() {
        return "--- Event --- \n-title: " + title + "\n-description: " + description + "\n-eventInit: " + eventInit
                + "\n-eventEnd: " + eventEnd + "\n-data of event creation: " + dataOfEventCreation;
    }

    public static ArrayList<Event> getEvents() {
        return events;
    }

    public static void setEvents(ArrayList<Event> events) {
        Event.events = events;
    }

    public LocalDateTime getEventInit() {
        return eventInit;
    }

    public void setEventInit(LocalDateTime eventInit) {
        this.eventInit = eventInit;
    }

    public LocalDateTime getEventEnd() {
        return eventEnd;
    }

    public void setEventEnd(LocalDateTime eventEnd) {
        this.eventEnd = eventEnd;
    }
}
