package br.com.maratonajava.aula.Aprojects.todolist.test;

import br.com.maratonajava.aula.Aprojects.todolist.main.Objects;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.Category;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.Priority;
import br.com.maratonajava.aula.Aprojects.todolist.main.domain.Task;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Conclusion;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Create;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Modify;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.NoSuchElementException;

public class CreateTest01 {
    public static void main(String[] args) {
        
        Task thisTask = Create.task("Título teste", "Descrição teste de nova tarefa da classe Task", Category.HOME, Priority.NORMAL, LocalDateTime.of(2024, Month.FEBRUARY, 28, 12, 30));
        System.out.println(thisTask);
        Modify.task(thisTask, "Novo título de teste", null, Category.HEALTH, Priority.URGENCY, null);
        System.out.println(thisTask);

        Conclusion.concludeTask(thisTask);
        System.out.println(thisTask);

        Conclusion.undoTaskConclusion(thisTask);
        System.out.println(thisTask);
        System.out.println("Sucess in undo conclusion? "+Conclusion.undoTaskConclusion(thisTask));

//        Remove.task(thisTask);
        try {
            System.out.println(Objects.taskList.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Erro: Elemento não encontrado");
            throw new RuntimeException(e);
        }
    }
}
