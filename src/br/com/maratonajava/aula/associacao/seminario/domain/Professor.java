package br.com.maratonajava.aula.associacao.seminario.domain;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String especialidade;
    private ArrayList<Seminario> seminarios = new ArrayList();

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        System.out.println("Novo professor cadastrado!!!");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String seminariosInfo = "";
        for (Seminario seminario : seminarios) {
            seminariosInfo += seminario.toString();
        }
        return "--- Professor ---" +
                "\nNome:" + nome + "\n" +
                "Especialidade: j" + especialidade + "\n" +
                "Seminarios: "+seminariosInfo+"\n";
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
        this.seminarios.addAll(List.of(seminarios));
        for (Seminario seminario : seminarios) {
            seminario.setProfessor(this);
        }
    }
}
