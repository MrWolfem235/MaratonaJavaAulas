package br.com.maratonajava.aula.Aprojects.todolist.main.services;

import br.com.maratonajava.aula.Aprojects.todolist.main.Objects;
import br.com.maratonajava.aula.Aprojects.todolist.main.domain.Note;
import br.com.maratonajava.aula.Aprojects.todolist.main.domain.Task;

public class Remove {
    //these methods remove the object of the Objects Arrays, locals objects will remain
    public static boolean task(Task task){
        return Objects.taskList.remove(task);
    }

    public static boolean note(Note note){
        return Objects.noteList.remove(note);
    }
}
