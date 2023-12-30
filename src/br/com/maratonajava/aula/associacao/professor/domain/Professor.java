package br.com.maratonajava.aula.associacao.professor.domain;

public class Professor {
    private String nome;
    private Escola escola;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, Escola escola) {
        this.nome = nome;
        this.escola = escola;
        escola.addProfessores(this);
    }

    public String info(){
        String info = this.getNome() + (escola != null? this.escola.getNome():"");
        return info;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
}
