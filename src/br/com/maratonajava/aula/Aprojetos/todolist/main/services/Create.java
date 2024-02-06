package br.com.maratonajava.aula.Aprojetos.todolist.main.services;

import br.com.maratonajava.aula.Aprojetos.todolist.main.enums.Category;
import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Note;
import br.com.maratonajava.aula.Aprojetos.todolist.main.enums.Priority;
import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Task;

import java.time.LocalDateTime;

public class Create {
    public static Task task(String title, String description, Category category, Priority priority, LocalDateTime deadLine){
        return new Task(title, description, category, priority, deadLine, LocalDateTime.now(), LocalDateTime.now());
    }

    public static Note note(String title, String description){
        return new Note(title, description, LocalDateTime.now(), LocalDateTime.now());
    }
}
