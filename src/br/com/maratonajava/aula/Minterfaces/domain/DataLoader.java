package br.com.maratonajava.aula.Minterfaces.domain;

public interface DataLoader {
    public void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões...");
    };

    public int MAX_DATA_SIZE = 10;

    public static void retrieveMaxDataSize(){
        System.out.println("Executando pela interface DataLoader...");
    }
}
