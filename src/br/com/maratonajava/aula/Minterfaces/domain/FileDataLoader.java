package br.com.maratonajava.aula.Minterfaces.domain;

public class FileDataLoader implements DataLoader, DataRemover {
    @Override
    public void load(){
        System.out.println("Carregando dados do arquivo...");
    }

    @Override
    public void remove(){
        System.out.println("Apagando arquivo...");
    }
}
