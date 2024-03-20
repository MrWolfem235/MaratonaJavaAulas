package br.com.maratonajava.aula.XColections.domain;

import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Character implements Comparable<Character> {
        private int id;
        private String name;
        private int força;
        private int inteligencia;

    public Character(String name, int força, int inteligencia) {
        Objects.requireNonNull(name, "Name não pode ser nulo");
        Objects.requireNonNull(id, "Id não pode ser nulo");
        this.name = name;
        this.força = força;
        this.inteligencia = inteligencia;
        this.id = ThreadLocalRandom.current().nextInt(0, 1_000);
    }

    public Character(int id, String name, int força, int inteligencia) {
        this.id = id;
        this.name = name;
        this.força = força;
        this.inteligencia = inteligencia;
    }

    public Character(String name) {
        Objects.requireNonNull(name, "Name não pode ser nulo");
        Objects.requireNonNull(id, "Id não pode ser nulo");
        this.name = name;
        this.força = 0;
        this.inteligencia = 0;
        this.id = ThreadLocalRandom.current().nextInt(0, 1_000);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return id == character.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Character character) {
        return this.name.compareTo(character.getName());
    }

    @Override
        public String toString() {
            return String.format("=== CHARACTER STATUS ===\n%15s %s\n%15s %s\n%15s %s\n%15s %s\n","Id:",this.id, "Nome:", this.name, "Força:", this.força, "Inteligência:", this.inteligencia);
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
