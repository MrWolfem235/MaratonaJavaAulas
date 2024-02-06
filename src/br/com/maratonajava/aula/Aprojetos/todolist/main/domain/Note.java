package br.com.maratonajava.aula.Aprojetos.todolist.main.domain;

import br.com.maratonajava.aula.Aprojetos.todolist.main.Objects;

import java.time.LocalDateTime;

//model object for notes
public class Note extends Object{
    private LocalDateTime creationDate;
    private LocalDateTime lastModify;

    public Note(String title, String description, LocalDateTime creationDate, LocalDateTime lastModify ) {
        super(title, description);
        this.creationDate = creationDate;
        this.lastModify = lastModify;

        //any note created go to task list in objects
        Objects.noteList.add(this);
    }

    @Override
    public String toString() {
        return "Nota:" +
                "\n\ttítulo: " + title+
                "\n\tDescrição: " + description+
                "\n\tData de criação: " + creationDate+
                "\n\tÚltima modificação: " + lastModify
                + "\n\n";
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
