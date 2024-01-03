package br.com.maratonajava.aula.modificadorabstrato.domain;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public String toString(){
        return "=== Desenvolvedor ===\n"+super.toString();
    }

    public void calcBonus(){
        this.salario  += this.salario * 0.02;
    }
}
