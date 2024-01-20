package br.com.maratonajava.aula.Gassociacao.jogador.test;

import br.com.maratonajava.aula.Gassociacao.jogador.domain.Jogador;
import br.com.maratonajava.aula.Gassociacao.jogador.domain.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Sena");
        Time time = new Time("Santos", jogador1, jogador2);
        Jogador jogadores[] = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador: jogadores){
            System.out.println(jogador.info());
        }
    }
}
