package br.com.maratonajava.aula.projetos.passagemaerea.model;

public class PassagemAereaTest01 {
    public static void main(String[] args) {
        Local l1 = new Local("Maldivas");
        Aviao a1 = new Aviao("Boing 737", 85);
        Voo v1 = new Voo(a1, l1);
        System.out.println(v1.toString());

    }
}
