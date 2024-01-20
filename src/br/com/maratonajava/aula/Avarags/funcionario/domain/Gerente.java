package br.com.maratonajava.aula.Avarags.funcionario.domain;

public class Gerente extends Funcionario {
    public Gerente(String name, int age, float... wages) {
        super(name, age, wages);
    }

    @Override
    public String info() {
        String wagesInfo = "";
        for (float aux : this.getWages()) {
            wagesInfo += ("- R$:" + format.format(aux) + "\n");
        }
        return String.format("------GERENTE------\nNome: %s\nIdade: %d\nSalarios: \n%s----------------\n", this.getName(), this.getAge(), wagesInfo);
    }
}
