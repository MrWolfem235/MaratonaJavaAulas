package br.com.maratonajava.aula.Eblocoinicializacao.anime.test;

import br.com.maratonajava.aula.Eblocoinicializacao.anime.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        try {
            Anime anime01 = new Anime(100);
            Anime anime02 = new Anime("One Piece", 1000);
            Anime anime03 = new Anime();
            Anime anime04 = new Anime("Naruto", 1570);
            System.out.println(anime01.infoEpisodios());
            System.out.println(anime02.infoEpisodios());
            System.out.println(anime03.infoEpisodios());
            System.out.println(anime04.infoEpisodios());
            System.out.println(Anime.listaAnimes());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
        }
    }
}
