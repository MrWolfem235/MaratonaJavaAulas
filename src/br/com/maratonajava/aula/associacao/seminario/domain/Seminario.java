package br.com.maratonajava.aula.associacao.seminario.domain;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private String titulo;
    private Local local;
    private ArrayList<Aluno> alunos = new ArrayList();
    private Professor professor;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.setLocal(local);
        System.out.println("Novo seminário registrado!!!");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String alunosInfo = "";
        for (Aluno aluno: alunos){
            alunosInfo += aluno.getNome();
        }
        return "--- Seminário ---" +
                "\nTitulo: " + titulo+
                (local == null? "":"\nLocal: " + local.getEndereco())+
                (professor == null? "":"\nProfessor: "+ professor.getNome())+
                "\nAlunos: "+alunosInfo+"\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAlunos(Aluno... alunos) {
        this.alunos.addAll(List.of(alunos));
        for (Aluno aluno: alunos){
            aluno.setSeminario(this);
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
        professor.setSeminarios(this);
    }
}
