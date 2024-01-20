package br.com.maratonajava.aula.Hheranca.domain;

public class Funcionario extends Pessoa {
    private float salario;

    static{
        System.out.println("Dentro do inicializador estatico da sub-classe");
    }
    
    {
        System.out.println("Dentro do inicializador de instâncias da sub-classe");
    }
    
    public Funcionario(String nome, String cpf, Endereco endereco, float salario){
        super(nome, cpf, endereco);
        this.salario = salario;
        System.out.println("Dentro do construtor da sub-classe");
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
