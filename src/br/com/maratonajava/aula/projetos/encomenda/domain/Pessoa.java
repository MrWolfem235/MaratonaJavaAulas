package br.com.maratonajava.aula.projetos.encomenda.domain;

public abstract class Pessoa {
    private String nome;
    private Endereco endereco;
    private String cpf;
    
    public Pessoa(String nome, Endereco endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    

    @Override
    public String toString() {
        return "--- Pessoa --- \n-Nome: " + nome + "\n-CPF: " + cpf + "\n-Endereco: \n" + endereco;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
