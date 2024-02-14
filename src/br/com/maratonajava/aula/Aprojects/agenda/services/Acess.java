package br.com.maratonajava.aula.Aprojects.agenda.services;

import br.com.maratonajava.aula.Aprojects.agenda.classes.Event;

//class for output info about Events
public class Acess {

    public String showEventInfo(int index){
        Event thisEvent = Event.getEvents().get(index);

        return String.format("=== EVENTO ===  \nTítulo:  %50s\nDescrição: %50s\nData de início: %50s\nData de término: %50s\n\nCriação do evento: %50s", thisEvent.getTitle(), thisEvent.getDescription(), thisEvent.getEventInit(), thisEvent.getEventEnd(), thisEvent.getDataOfEventCreation());
    }

    public String showAllEventsInfo(){
        String allEventInfo = "";
        for (Event event : Event.getEvents()){
            allEventInfo += showEventInfo(Event.getEvents().indexOf(event));
        }
        return allEventInfo;
    }
}
