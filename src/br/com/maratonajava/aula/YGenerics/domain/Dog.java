package br.com.maratonajava.aula.YGenerics.domain;

public class Dog extends Animal{
    String race;

    public Dog(String name, int age, String race) {
        super(name, age);
        this.race = race;
    }

    @Override
    public void song() {
        System.out.println("Au Au Au!!! 🐶");
    }

    @Override
    public String toString() {
        return super.toString().concat(String.format("| Race: %s "));
    }
}
