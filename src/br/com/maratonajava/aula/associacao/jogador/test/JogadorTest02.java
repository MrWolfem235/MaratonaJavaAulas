package br.com.maratonajava.aula.associacao.jogador.test;

import br.com.maratonajava.aula.associacao.jogador.domain.Jogador;
import br.com.maratonajava.aula.associacao.jogador.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Jogador jogador03 = new Jogador("Cássio");
        Time time = new Time("Seleção Brasileira", jogador01, jogador02, jogador03);

        System.out.println(time.info());
    }
}
