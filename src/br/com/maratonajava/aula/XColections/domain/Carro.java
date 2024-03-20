package br.com.maratonajava.aula.XColections.domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Carro {
    private String modelo;
    private int ano;
    private int id;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.id = ThreadLocalRandom.current().nextInt(0, 1_000);
    }

    public Carro(String modelo, int ano, int id) {
        this.modelo = modelo;
        this.ano = ano;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("=== CARRO STATUS ===\n%15s %s\n%15s %s\n%15s %s\n", "Modelo:",this.modelo, "Ano:", this.ano, "ID:", this.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Double.compare(id, carro.id) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
