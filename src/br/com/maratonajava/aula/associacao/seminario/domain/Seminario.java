package br.com.maratonajava.aula.associacao.seminario.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seminario {
    private String titulo;
    private Local local;
    private ArrayList<Aluno> alunos = new ArrayList();
    private Professor professor;
    private static ArrayList <Seminario> seminarios = new ArrayList();

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.setLocal(local);
        System.out.println("Novo seminário registrado!!!");
        System.out.println(toString());
        seminarios.add(this);
    }

    @Override
    public String toString() {
        String alunosInfo = "";
        for (Aluno aluno: alunos){
            alunosInfo += aluno.getNome()+" ";
        }
        return "--- Seminário ---" +
                "\nTitulo: " + titulo+
                (local == null? "":"\nLocal: " + local.getEndereco())+
                "\nProfessor: "+(professor == null? "": professor.getNome())+
                "\nAlunos: "+alunos.size()+"\n"+alunosInfo+"\n";
    }

    public static String seminariosToString(){
        String info = "";
        for (Seminario seminario: seminarios){
            info += seminario.toString()+"\n";
        }
        return info;
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

    public void setAlunos(Aluno... alunos) {
        this.alunos.addAll(List.of(alunos));
    }

    public void addAlunos(Aluno... alunos) {
        setAlunos(alunos);
        for (Aluno aluno: alunos){
            aluno.setSeminario(this);
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addProfessor(Professor professor){
        this.setProfessor(professor);
        professor.setSeminarios();
    }

    public static ArrayList<Seminario> getSeminarios() {
        return seminarios;
    }

    public static void setSeminarios(ArrayList seminarios) {
        Seminario.seminarios = seminarios;
    }
}
