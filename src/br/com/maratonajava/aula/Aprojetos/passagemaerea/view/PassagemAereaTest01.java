package br.com.maratonajava.aula.Aprojetos.passagemaerea.view;

import br.com.maratonajava.aula.Aprojetos.passagemaerea.assento.TipoAssento;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Aviao;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Local;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Voo;

public class PassagemAereaTest01 {
    public static void main(String[] args) {
        Local l1 = new Local("Maldivas");
        Aviao a1 = new Aviao("Boing 737", 5);
        a1.addAssentos(75, TipoAssento.COMUM);
        a1.addAssentos(15, TipoAssento.EXECUTIVO);
        Voo voo = new Voo(a1, l1);

        System.out.println(voo.toString());
    }
}
