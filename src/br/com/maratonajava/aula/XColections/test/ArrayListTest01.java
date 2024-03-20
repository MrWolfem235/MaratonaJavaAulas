package br.com.maratonajava.aula.XColections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Personagem{
    private int id;
    private String name;
    private int força;
    private int inteligencia;

    public Personagem(int id, String name, int força, int inteligencia) {
        Objects.requireNonNull(name, "Name não pode ser nulo");
        Objects.requireNonNull(id, "Id não pode ser nulo");
        this.id = id;
        this.name = name;
        this.força = força;
        this.inteligencia = inteligencia;
    }

    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        if (obj == this) return true;
        Personagem personagem = (Personagem) obj;
        if (personagem == this) return true;
        if (this.name.equals(personagem.name)) return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("=== STATUS ===\n%15s %s\n%15s %s\n%15s %s\n%15s %s\n","Id:",this.id, "Nome:", this.name, "Força:", this.força, "Inteligência:", this.inteligencia);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}

public class ArrayListTest01 {
    public static void main(String[] args) {
        List<Personagem> animeCharacters = new ArrayList(4);
        List<Personagem> gameCharacters = new ArrayList(4);
        animeCharacters.add(new Personagem(1,"Naruto", 10, 7));
        animeCharacters.add(new Personagem(2,"Sasuke", 9, 9));
        animeCharacters.add(new Personagem(3,"Saitama", 999, 8));
        gameCharacters.add(new Personagem(4,"Link", 8, 9));
        gameCharacters.add(new Personagem(5,"Exdeath", 20, 23));
        gameCharacters.add(new Personagem(6,"Luigi", 8, 8));

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(1250.55);
        dinheiros.add(250.99);
        dinheiros.add(999.99);
        dinheiros.add(120.5);
        dinheiros.add(99.99);

        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Daniel");
        nomes.add("Heloísa");
        nomes.add("Amanda");
        nomes.add("Eribaldo");

        List<Personagem> characters = new ArrayList<>(8);
        characters.addAll(animeCharacters);
        characters.addAll(gameCharacters);

        Collections.sort(dinheiros);
        Collections.sort(nomes);

        for (Double dinheiro : dinheiros){
            System.out.println(dinheiro);
        }

        for (String nome: nomes){
            System.out.println(nome);
        }
    }
}
