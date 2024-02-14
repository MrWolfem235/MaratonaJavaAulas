package br.com.maratonajava.aula.Aprojects.todolist.main.view.visual;

import br.com.maratonajava.aula.Aprojects.todolist.main.Objects;
import br.com.maratonajava.aula.Aprojects.todolist.main.domain.Note;
import br.com.maratonajava.aula.Aprojects.todolist.main.domain.Object;
import br.com.maratonajava.aula.Aprojects.todolist.main.domain.Task;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.InfoLevel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class Format {

    //VISUAL FORMATING MEHTODS

    //return a visual format about the task conclusion
    public static String isConcludedFormated(Task task){
        return task.isConcluded()? (Colors.format("Concluída", Colors.GREEN)):(Colors.format("Não concluída", Colors.RED));
    }

    //return a visual format about the task priority
    public static String taskPriorityFormated (Task task){
        return switch (task.getPriority()){
            case CASUAL -> {
                yield Colors.format("Baixa prioridade", Colors.BLUE);
            }
            case NORMAL -> {
                yield Colors.format("Prioridade comum", Colors.YELLOW);
            }
            case URGENCY -> {
                yield Colors.format("Prioridade Urgente", Colors.RED);
            }
        };
    }
    
    //return a visual format about task deadline
    public static String taskDeadLineFormated (Task task){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY - HH:mm:ss");
        return Colors.format(task.getDeadLine().format(formatter), Colors.GRAY);
    }

    //return a visual format about task / note title
    public static String titleFormated (Object object){
        return Colors.format(object.getTitle(), Colors.WHITE_BACK);
    }

    //supercharge to specify the title color
    public static String titleFormated (Object object, Colors color){
        return Colors.format(object.getTitle(), color);
    }

    //return a visual format about task creation and last modify date
    public static String taskDateFormated (LocalDateTime date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY - HH:mm:ss");
        return Colors.format(date.format(formatter), Colors.YELLOW);
    }



    //FORMAT TASK

    public static String formatTask (Task task, InfoLevel infoLevel){
        switch (infoLevel) {
            case TITLE:
                return titleFormated(task) + "\n\n";
            case SIMPLE:
                return String.format("%s \n%s \n%15s \n\n", titleFormated(task), task.getDescription(), isConcludedFormated(task));
            case MEDIUM:
                return String.format("%s \n%s \n%15s %10s %10s\nPrazo: %30s\n\n", titleFormated(task), task.getDescription(), isConcludedFormated(task), task.getCategory(), taskPriorityFormated(task), taskDeadLineFormated(task));
            case FULL:
                return String.format("%s \n%s \n%15s %10s %10s\nPrazo: %30s\nCriação: %30s\nÚltima modificação: %30s\n\n", titleFormated(task),task.getDescription(), isConcludedFormated(task), task.getCategory(), taskPriorityFormated(task),  taskDeadLineFormated(task), taskDateFormated(task.getCreationDate()), taskDateFormated(task.getLastModify()));
            case DEBUG:
                return String.format("ID: %s %s \n%s \n%15s %10s %10s\nPrazo: %30s\nCriação: %30s\nÚltima modificação: %30s\n\n", Objects.taskList.indexOf(task), titleFormated(task),task.getDescription(), isConcludedFormated(task), task.getCategory(), taskPriorityFormated(task),  taskDeadLineFormated(task), taskDateFormated(task.getCreationDate()), taskDateFormated(task.getLastModify()));
            default:
                System.out.println("ERRO: infoLevel "+infoLevel+" não suportado em formatTask");
                return null;
        }
    }

    public static String formatTasksArrayList (ArrayList<Task> taskList, InfoLevel infoLevel){
        String string = "";
        for (Task task : taskList){
            string += formatTask(task, infoLevel);
        }
        return string;
    }



    //FORMAT NOTE

    public static String formatNote (Note note, InfoLevel infoLevel){
        switch (infoLevel) {
            case TITLE:
                return String.format("%s\n\n", titleFormated(note, Colors.BLUE_BACK));
            case SIMPLE:
                return String.format("%s \n%s\n\n", titleFormated(note, Colors.BLUE_BACK), note.getDescription());
            case DEBUG:
                return String.format("ID: %s %s \n%s\n\n",Objects.noteList.indexOf(note), titleFormated(note, Colors.BLUE_BACK), note.getDescription());
            default:
                System.out.println("ERRO: Info Level "+infoLevel+" não suportado para note");
                return null;
        }
    }

    public static String formatNoteArrayList (ArrayList<Note> noteList, InfoLevel infoLevel){
        String string = "";
        for (Note note : noteList){
            string += formatNote(note, infoLevel);
        }
        return string;
    }
}
