package br.com.maratonajava.aula.Aprojects.passagemaerea.model;

public class Pessoa {
    private String nome;
    private String cpf;
    private Voo vooCadastrado;//informação do voo o qual esta pessoa está ligada
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "--- Pessoa ---\n-Nome: " + nome + "\n-CPF: " + cpf + "\n\n-Voo Cadastrado: \n" + vooCadastrado.basicInfo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Voo getVooCadastrado() {
        return vooCadastrado;
    }

    public void setVooCadastrado(Voo vooCadastrado) {
        this.vooCadastrado = vooCadastrado;
    }
    
}
