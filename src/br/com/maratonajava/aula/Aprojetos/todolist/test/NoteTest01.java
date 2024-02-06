package br.com.maratonajava.aula.Aprojetos.todolist.test;

import br.com.maratonajava.aula.Aprojetos.todolist.main.Objects;
import br.com.maratonajava.aula.Aprojetos.todolist.main.domain.Note;
import br.com.maratonajava.aula.Aprojetos.todolist.main.services.Create;
import br.com.maratonajava.aula.Aprojetos.todolist.main.services.Modify;

import java.util.NoSuchElementException;

public class NoteTest01 {
    public static void main(String[] args) {
        Note thisNote = Create.note("Título teste de nota", "Descrição teste de nota criada por um services!");
        System.out.println(thisNote);

        Modify.note(thisNote, "Título modificado de nota", "Descrição modificada de nota");
        System.out.println(thisNote);

//        Remove.note(thisNote);
        try {
            System.out.println(Objects.noteList.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Erro: Nota não encontrado");
            throw new RuntimeException(e);
        }

    }
}
