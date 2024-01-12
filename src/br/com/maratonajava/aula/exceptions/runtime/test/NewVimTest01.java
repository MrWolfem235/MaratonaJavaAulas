package br.com.maratonajava.aula.exceptions.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.maratonajava.aula.exceptions.runtime.domain.NewVim;

public class NewVimTest01 {
    public static void main(String[] args) {

        try{
        NewVim.read("src\\br\\com\\maratonajava\\aula\\exceptions\\arquivo\\test.txt");
        System.out.println("Main: read Executou a leitura com sucesso!");
        }catch (FileNotFoundException e){
            System.out.println("Main: read encontrou erros ao encontrar o caminho do arquivo...");
        }catch (IOException e){
            System.out.println("Main: read encontrou erros inesperados na execução da leitura...");
        }finally{
            System.out.println("Main: Finalizando leitura...");
        }

    }
}
