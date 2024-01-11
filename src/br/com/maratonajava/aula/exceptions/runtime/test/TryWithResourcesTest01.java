package br.com.maratonajava.aula.exceptions.runtime.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        try (Reader reader = new BufferedReader (new FileReader("test.txt"))){
            reader.read();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch( IOException e){
            e.printStackTrace();
        }
    }
}

/*Try with resources, uma versão mais automatizada do try, onde originalmente 
seria necessário fechar manualmente qualquer processo que deva ser fechado usando o finally,
Esse try pode ser usado desde que a Classe desse objeto que vá ser fechado implemente closeble
e de as instruções de como fechar, sobrescrevendo o close, que será automaticamente usado pelo try
para fechar o que for preciso 
*/