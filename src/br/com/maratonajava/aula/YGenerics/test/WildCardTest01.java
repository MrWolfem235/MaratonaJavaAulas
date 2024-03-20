package br.com.maratonajava.aula.YGenerics.test;

import java.util.ArrayList;
import java.util.List;

abstract class Planta{
    public abstract void regar();
}

class Cacto extends Planta{
    @Override
    public void regar() {
        System.out.println("Regando cacto 🌵");
    }
}

class Arvore extends Planta{
    @Override
    public void regar() {
        System.out.println("Regando árvore 🌲");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        List<Planta> plantas = new ArrayList<>(List.of(new Cacto(), new Cacto(), new Arvore(), new Cacto()));

        List<Cacto> cactos = new ArrayList<>(List.of(new Cacto(), new Cacto(), new Cacto()));

        List<Arvore> arvores = new ArrayList<>(List.of(new Arvore(), new Arvore(), new Arvore()));

        regarPlantas(plantas);
        adicionarPlantas(plantas);
        System.out.println("-------------------");
        regarPlantas(plantas);
    }

    private static void regarPlantas(List<? extends Planta> plantas){
        for (Planta planta : plantas) {
            planta.regar();
        }
        //Pode ser que o tipo passado não seja Cacto e dê numa excessão
        //plantas.add(new Cacto());
    }

    private static void adicionarPlantas(List<? super Planta> plantas){
        //aqui o java tem certeza que qualquer pai de Planta pode receber qualquer filho de Planta
        plantas.add(new Cacto());
        plantas.add(new Arvore());
    }


}
