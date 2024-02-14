package br.com.maratonajava.aula.Aprojects.agenda.classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task extends Date{

    private static ArrayList<Task> tasks = new ArrayList<Task>();

    private LocalDateTime date;

    public Task(LocalDateTime date, String title, String description) {
        super(title, description);
        this.date = date;
        //in creation, add this task to list
        tasks.add(this);
    }


    public Task modify(String title, String description, LocalDateTime date){

        //if the input value is null, keep the original
        this.setTitle((title == null ? this.getTitle() : title));
        this.setDescription((description == null ? this.getDescription() : description));
        this.setDate((date == null ? this.getDate() : date));

        return this;
    }

    public boolean delete(){
        return tasks.remove(this);
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
