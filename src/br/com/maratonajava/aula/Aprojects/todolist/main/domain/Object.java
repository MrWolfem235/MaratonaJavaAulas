package br.com.maratonajava.aula.Aprojects.todolist.main.domain;

public abstract class Object {
    public String title;
    public String description;

    public Object(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
