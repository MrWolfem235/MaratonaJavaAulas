package br.com.maratonajava.aula.Aprojetos.passagemaerea.view;

import br.com.maratonajava.aula.Aprojetos.passagemaerea.assento.TipoAssento;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Aviao;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Local;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Pessoa;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Voo;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.services.Info;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.services.Reserva;

public class PassagemAereaTest03 {
    public static void main(String[] args) {
        try{
//
            Pessoa p1 = new Pessoa("Doublas");
            Local l1 = new Local("Disney");
            Aviao a1 = new Aviao("Boing 737", 4);
            a1.addAssentos(70, TipoAssento.COMUM);
            Voo v1 = new Voo(a1, l1);
            Reserva.reservar(v1, "B2", p1);
            System.out.println(Info.all(v1));
//
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
