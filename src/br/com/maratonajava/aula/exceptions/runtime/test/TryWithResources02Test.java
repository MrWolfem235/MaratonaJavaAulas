package br.com.maratonajava.aula.exceptions.runtime.test;

import java.io.IOError;
import java.io.IOException;

import br.com.maratonajava.aula.exceptions.runtime.domain.*;

public class TryWithResources02Test {
    public static void main(String[] args) {
        try (ArquiveReader1 reader1 = new ArquiveReader1(); ArquiveReader2 reader2 = new ArquiveReader2()){
            //inicializando os "recursos fecháveis" no try
            System.out.println("TryWithResources02Test: Iniciando Leitura de arquivo...");
        }catch(IOException e){
            //captura a possível exceção de IO
            e.printStackTrace();
        }
        //não precisa fechar a conexão com ~finally, o próprio try chama o ~close do objeto fechável para finalizar
    }
}
