package br.com.maratonajava.aula.associacao.seminario.domain;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String especialidade;
    private ArrayList<Seminario> seminarios = new ArrayList();
    private static ArrayList <Professor> professores = new ArrayList();

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        System.out.println("Novo professor cadastrado!!!");
        System.out.println(toString());
        professores.add(this);
    }

    @Override
    public String toString() {
        String seminariosInfo = "";
        if (seminarios != null) {
            for (Seminario seminario : seminarios) {
                seminariosInfo += "\n-"+seminario.getTitulo();
            }
        }
        return "--- Professor ---" +
                "\nNome: " + nome + "\n" +
                "Especialidade: " + especialidade + "\n" +
                "Seminarios: "+seminariosInfo+"\n";
    }

    public static String professoresToString(){
        String info = "";
        for (Professor professor: professores){
            info += professor.toString()+"\n";
        }
        return info;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Object getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario... seminarios) {
        this.seminarios.addAll(List.of(seminarios));
    }

    public void addSeminarios(Seminario... seminarios) {
        setSeminarios(seminarios);
        for (Seminario seminario : seminarios) {
            seminario.setProfessor(this);
        }
    }

    public static ArrayList getProfessores() {
        return professores;
    }

    public static void setProfessores(ArrayList professores) {
        Professor.professores = professores;
    }
}
