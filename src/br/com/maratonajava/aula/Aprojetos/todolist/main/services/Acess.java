package br.com.maratonajava.aula.Aprojetos.todolist.main.services;

import br.com.maratonajava.aula.Aprojetos.todolist.main.Objects;
import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Note;
import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Task;
import br.com.maratonajava.aula.Aprojetos.todolist.main.enums.OrderList;

import java.util.ArrayList;
import java.util.Comparator;

public class Acess {

    public static ArrayList<Task> getTasksByOrder (OrderList orderList){
        ArrayList<Task> taskList = Objects.taskList;
        return switch (orderList) {
            case BY_TITLE -> {
                taskList.sort(Comparator.comparing(Task::getTitle));
                yield taskList;
            }
            case BY_CATEGORY -> {
                taskList.sort(Comparator.comparing(Task::getCategory));
                yield taskList;
            }
            case BY_PRIORITY -> {
                taskList.sort(Comparator.comparing(Task::getPriority));
                yield taskList;
            }
            case BY_CREATION_DATE -> {
                taskList.sort(Comparator.comparing(Task::getCreationDate));
                yield taskList;
            }
            case BY_LAST_MODIFIED -> {
                taskList.sort(Comparator.comparing(Task::getLastModify));
                yield taskList;
            }
            case BY_CONCLUSION -> {
                taskList.sort(Comparator.comparing(Task::isConcluded));
                yield taskList;
            }
        };
    }

    public static ArrayList<Note> getNotesByOrder (OrderList orderList){
        ArrayList<Note> noteList = Objects.noteList;
        switch (orderList) {
            case BY_TITLE : {
                noteList.sort(Comparator.comparing(Note::getTitle));
                return noteList;
            }
            case BY_CREATION_DATE : {
                noteList.sort(Comparator.comparing(Note::getCreationDate));
                return noteList;
            }
            case BY_LAST_MODIFIED : {
                noteList.sort(Comparator.comparing(Note::getLastModify));
                return noteList;
            }
            default:
                System.out.println("Erro: Tipo de ordem "+orderList+" não permitida para notas");
                return noteList;
        }
    }

}
