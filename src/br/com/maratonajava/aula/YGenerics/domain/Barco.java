package br.com.maratonajava.aula.YGenerics.domain;

public class Barco {
    private String name;

    public Barco(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
