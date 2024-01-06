package br.com.maratonajava.aula.projetos.passagemaerea.view;

import br.com.maratonajava.aula.projetos.passagemaerea.model.Local;
import br.com.maratonajava.aula.projetos.passagemaerea.model.Voo;
import br.com.maratonajava.aula.projetos.passagemaerea.assento.TipoAssento;
import br.com.maratonajava.aula.projetos.passagemaerea.model.Aviao;

public class PassagemAereaTest01 {
    public static void main(String[] args) {
        Local l1 = new Local("Maldivas");
        Aviao a1 = new Aviao("Boing 737");
        a1.addAssentos(100, TipoAssento.COMUM);
        a1.addAssentos(25, TipoAssento.EXECUTIVO);
        Voo voo = new Voo(a1, l1);

        System.out.println(a1.toString());
    }
}
