package br.com.maratonajava.aula.associacao.seminario.domain;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario = new Seminario(null,null);

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Novo aluno cadastrado!");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "--- Aluno ---\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade +"\n" +
                "Seminário: "+seminario.getTitulo()+"\n";
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
}
