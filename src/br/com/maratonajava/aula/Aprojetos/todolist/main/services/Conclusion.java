package br.com.maratonajava.aula.Aprojetos.todolist.main.services;

import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Task;

public class Conclusion {

    //if already conclude return false, if it become conclude return true
    public static boolean concludeTask (Task task){
        if (task.isConcluded()){
            return false;
        } else {
            task.setConcluded(true);
            return true;
        }
    }

    //use colclusion in multiple tasks
    public static boolean concludeTask (Task... tasks){
        for (Task task : tasks){
            concludeTask(task);
        }
        return false;
    }

    //if already not conclude return false, if it become undo return true
    public static boolean undoTaskConclusion(Task task){
        if (!task.isConcluded()){
            return false;
        } else {
            task.setConcluded(false);
            return true;
        }
    }
}
