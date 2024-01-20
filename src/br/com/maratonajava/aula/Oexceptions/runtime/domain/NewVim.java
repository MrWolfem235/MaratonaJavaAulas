package br.com.maratonajava.aula.Oexceptions.runtime.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public  class NewVim {
    
    public static void read(String textPath) throws FileNotFoundException, IOException{

        //try with resouces do NewVim cuida de fechar a leitura
        try(Reader reader = new FileReader(textPath) ){
            System.out.println("read: Iniciando leitura...");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String linha;
            //enquanto a próxima linha não for nula 
            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }
        }catch(FileNotFoundException e){
            System.out.println("read: Arquivo não encontrado para leitura...\nrepassando exceção para superior...");
            e.printStackTrace();
            //relançando exceção
            throw e;
        }catch(IOException e){
            System.out.println("read: Ocorreu um erro inesperado na leitura...\nrepassando exceção para superior...");
            e.printStackTrace();
            //relançando exceção
            throw e;
        }finally{
            System.out.println("read: Fechando arquivo pendente");
        }

    }

}
