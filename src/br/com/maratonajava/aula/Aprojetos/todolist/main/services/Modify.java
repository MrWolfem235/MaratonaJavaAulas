package br.com.maratonajava.aula.Aprojetos.todolist.main.services;

import br.com.maratonajava.aula.Aprojetos.todolist.main.enums.Category;
import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Note;
import br.com.maratonajava.aula.Aprojetos.todolist.main.enums.Priority;
import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Task;

import java.time.LocalDateTime;

public class Modify {
    public static Task task (Task task, String title, String description, Category category, Priority priority, LocalDateTime deadLine){

        //if the camp is null, keep the original data, if not, change
        if (title != null){
            task.setTitle(title);
        }
        if (description != null){
            task.setDescription(description);
        }
        if (category != null){
            task.setCategory(category);
        }
        if (priority != null){
            task.setPriority(priority);
        }
        if (deadLine != null){
            task.setDeadLine(deadLine);
        }

        //updating the last modify date
        task.setLastModify(LocalDateTime.now());

        return task;
    }

    public static Note note (Note note, String title, String description){

        //if the camp is null, keep the original data, if not, change
        if (title != null){
            note.setTitle(title);
        }
        if (description != null){
            note.setDescription(description);
        }

        //updating the last modify date
        note.setLastModify(LocalDateTime.now());

        return note;
    }
}
