package br.com.maratonajava.aula.modificadorabstrato.domain;

public class Gerente extends Funcionario {
    public Gerente (String nome, Double salario){
        super(nome, salario);
    }

    @Override
    public String toString(){
        return "=== Gerente ===\n"+super.toString();
    }
}
