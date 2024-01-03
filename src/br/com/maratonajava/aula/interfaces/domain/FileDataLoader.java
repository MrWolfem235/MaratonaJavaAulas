package br.com.maratonajava.aula.interfaces.domain;

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
