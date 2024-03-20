package br.com.maratonajava.aula.ZZInnerClass.test;
import br.com.maratonajava.aula.YGenerics.domain.Barco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassTest01 {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Navio"), new Barco("Canoa"), new Barco("Bote")));

        Collections.sort(barcos, new Comparator<Barco>() {
            @Override
            public int compare(Barco barco1, Barco barco2) {
                return barco1.getName().compareTo(barco2.getName());
            }
        });

        barcos.add(new Barco("Bote"){
            @Override
            public String toString() {
                return "Barco feito por uma classe anônima: "+super.toString();
            }
        });

        for (Barco barco : barcos) {
            System.out.println(barco);
        }
    }
}
