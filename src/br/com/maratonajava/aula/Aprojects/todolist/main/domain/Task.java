package br.com.maratonajava.aula.Aprojects.todolist.main.domain;

import br.com.maratonajava.aula.Aprojects.todolist.main.Objects;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.Category;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.Priority;

import java.time.LocalDateTime;

//model object for taks
public class Task extends  Object{
    private Category category;
    private Priority priority;
    private LocalDateTime deadLine;
    private boolean concluded;
    private LocalDateTime creationDate;
    private LocalDateTime lastModify;

    public Task(String title, String description, Category category, Priority priority, LocalDateTime deadLine,LocalDateTime creationDate, LocalDateTime lastModify ) {
        super(title, description);
        this.category = category;
        this.priority = priority;
        this.deadLine = deadLine;
        this.concluded = false;
        this.creationDate = creationDate;
        this.lastModify = lastModify;

        //any task created go to task list in objects
        Objects.taskList.add(this);
    }

    @Override
    public String toString() {
        return "Tarefa:" +
                "\n\ttítulo: " + title+
                "\n\tDescrição: " + description+
                "\n\tCategoria: " + category +
                "\n\tPrioridade: " + priority +
                "\n\tPrazo: " + deadLine +
                "\n\t" + (concluded?"Tarefa marcada como concluída!":"Tarefa ainda não concluída.")+
                "\n\tData de criação: " + creationDate +
                "\n\tÚltima modificação: " + lastModify
                + "\n\n";
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDateTime deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isConcluded() {
        return concluded;
    }

    public void setConcluded(boolean concluded) {
        this.concluded = concluded;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastModify() {
        return lastModify;
    }

    public void setLastModify(LocalDateTime lastModify) {
        this.lastModify = lastModify;
    }
}
