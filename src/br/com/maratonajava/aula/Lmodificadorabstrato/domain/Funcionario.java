package br.com.maratonajava.aula.Lmodificadorabstrato.domain;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcBonus();
    }

    @Override
    public String toString() {
        return "--- Funcionario --- \n-Nome: " + nome + "\n-Salario: " + salario;
    }

    @Override
    public void imprime(){
        System.out.println("Imprimindo...");
    }

    public abstract void calcBonus();
}