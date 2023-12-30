package br.com.maratonajava.aula.blocoinicializacao.anime.domain;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Anime {

    {Anime.listaAnimes.add(this);}

    private static ArrayList <Anime> listaAnimes = new ArrayList();
    private String nome;
    private String[] episodios;

    public Anime() {
        this.setEpisodios(new String[0]);
        this.setNome("---");
    }

    public Anime(String nome) {
        this.setNome(nome);
        this.setEpisodios(new String[0]);
    }

    public Anime(String nome, int episodios) {
        if (verNumNegativo(episodios)){
            excecaoEpNegativo();
        }
        this.setNome(nome);
        this.setEpisodios(new String[episodios]);
    }

    public Anime(int episodios){
        if (verNumNegativo(episodios)){
            excecaoEpNegativo();
        }
        this.setNome("---");
        this.setEpisodios(new String[episodios]);
    }


    public static String listaAnimes(){
        String info = "=======Lista Animes======\n";
        for (Anime anime: listaAnimes){
            info += anime.info()+"\n";
        }
        info += "======================\n";
        return info;
    }

    public String info(){
        return String.format("------Info------\nNome: %s\nEpisódios: %s\n----------------",this.getNome(),this.getEpisodios().length);
    }

    public String infoEpisodios(){
        String info = "------Episódios------\n"+this.getNome()+"\n";

        for (int i = 0 ; i < this.episodios.length ; i++){
            info += this.episodios[i] + " ";
            if ((i + 1) % 20 == 0 && i != 0){
                info += "\n";
            }
        }

        return info;
    }

    private boolean verNumNegativo (int num){
        if (num < 0){
            return true;
        }else{
            return false;
        }
    }

    private void excecaoEpNegativo(){
        throw new IllegalArgumentException("Erro: Numero de episódios negativo não permitido!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(String[] episodios) {
        this.episodios = episodios;
        DecimalFormat formatar = this.episodios.length > 999 ? new DecimalFormat("0000"):new DecimalFormat("000");
        for (int i = 0; i < this.episodios.length ; i++){
            this.episodios[i] = formatar.format(i+1);
        }
    }
}
