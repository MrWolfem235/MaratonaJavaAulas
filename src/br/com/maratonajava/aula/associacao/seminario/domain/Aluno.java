package br.com.maratonajava.aula.associacao.seminario.domain;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;
    private static ArrayList <Aluno> alunos = new ArrayList();

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Novo aluno cadastrado!");
        System.out.println(toString());
        alunos.add(this);
    }

    @Override
    public String toString() {
        return "--- Aluno ---\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade +"\n" +
                "Seminário: "+(seminario!=null?seminario.getTitulo():"")+"\n";
    }

    public static String alunosToString(){
        String info = "";
        for (Aluno aluno: alunos){
            info += aluno.toString()+"\n";
        }
        return info;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void addSeminario(Seminario seminario){
        this.seminario = seminario;
        seminario.addAlunos(this);
    }

    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public static void setAlunos(ArrayList alunos) {
        Aluno.alunos = alunos;
    }
}
