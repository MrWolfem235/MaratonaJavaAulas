package br.com.maratonajava.aula.Aprojetos.passagemaerea.view;

import br.com.maratonajava.aula.Aprojetos.passagemaerea.assento.TipoAssento;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Aviao;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Local;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Pessoa;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.model.Voo;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.services.Info;
import br.com.maratonajava.aula.Aprojetos.passagemaerea.services.Reserva;

public class PassagemAereaTest02 {
    public static void main(String[] args) {
        try{
            Pessoa p1 = new Pessoa("Nikito Yahaza");
            Pessoa p2 = new Pessoa("Araki nikimura");
            Local l1 = new Local("Maldivas");
            Aviao a1 = new Aviao("Boing 737", 4);
            a1.addAssentos(75, TipoAssento.COMUM);
            a1.addAssentos(10, TipoAssento.EXECUTIVO);
            Voo voo1 = new Voo(a1, l1);
            System.out.println(Reserva.reservar(voo1, "B2", p2));
            System.out.println(Reserva.reservar(voo1, "B5", p1));
            voo1.getAviao().getAssentoOrganizado()[1][3].setPessoa(p1);
            System.out.println(Info.all(voo1));
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
