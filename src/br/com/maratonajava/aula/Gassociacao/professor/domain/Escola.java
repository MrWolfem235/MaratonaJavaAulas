package br.com.maratonajava.aula.Gassociacao.professor.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Escola {
    private String nome;
    private ArrayList <Professor> professores = new ArrayList();

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor... professores) {
        this.nome = nome;
        Collections.addAll(this.professores, professores);
    }

    public String info(){
        String info = this.getNome()+"\n";
        for (Professor professor: professores){
            info += professor.getNome() +" - ";
        }
        return info;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Object getProfessores() {
        return professores;
    }

    public void addProfessores(Professor professor) {
        this.professores.add(professor);
    }
}
