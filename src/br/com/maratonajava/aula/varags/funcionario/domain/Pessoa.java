package br.com.maratonajava.aula.varags.funcionario.domain;

public abstract class Pessoa {
    String name;
    int age;

    public abstract String info();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
