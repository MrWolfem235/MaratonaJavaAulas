package br.com.maratonajava.aula.Aprojetos.agenda.classes;

import br.com.maratonajava.aula.Aprojetos.agenda.interfaces.scheduleObject;

import java.time.LocalDateTime;

public abstract class Date implements scheduleObject{
    protected String title;
    protected    String description;

    public Date(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //log
    protected LocalDateTime dataOfEventCreation;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDataOfEventCreation() {
        return dataOfEventCreation;
    }

    public void setDataOfEventCreation(LocalDateTime dataOfEventCreation) {
        this.dataOfEventCreation = dataOfEventCreation;
    }
}
