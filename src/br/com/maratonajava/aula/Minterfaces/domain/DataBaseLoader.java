package br.com.maratonajava.aula.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {
    
    @Override
    public void load(){
        System.out.println("Carregando dados do servidor...");
    }

    @Override
    public void remove(){
        System.out.println("Apagando dados do servidor...");
    }

}
