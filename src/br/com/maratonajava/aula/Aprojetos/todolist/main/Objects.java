package br.com.maratonajava.aula.Aprojetos.todolist.main;

import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Note;
import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Task;

import java.util.ArrayList;

//Centralize all objects that need to be acessed and saved after shutdown
public abstract class Objects {
    public static ArrayList<Task> taskList = new ArrayList<Task>();
    public static ArrayList<Note> noteList = new ArrayList<Note>();
}
