package br.com.maratonajava.aula.modificadorabstrato.domain;

public abstract class Funcionario{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "--- Funcionario --- \n-Nome: " + nome + "\n-Salario: " + salario;
    }

    
}