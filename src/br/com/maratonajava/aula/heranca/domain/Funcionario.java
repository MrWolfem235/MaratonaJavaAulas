package br.com.maratonajava.aula.heranca.domain;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome, String cpf, Endereco endereco, float salario){
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public String toString(){
        return "funcionario{ "+super.toString() + ", salario= "+this.salario+"}";
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
