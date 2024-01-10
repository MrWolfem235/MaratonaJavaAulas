package br.com.maratonajava.aula.exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class exception {
    public static void main(String[] args) {
        try{
            criarArquivo();
          }catch(IOException e){
              System.out.println("Falha na criação do arquivo...");//printa a confirmação do erro

          } 
    }

    public static void criarArquivo() throws IOException {
        try{
            File file = new File("src\\br\\com\\maratonajava\\aula\\exceptions\\arquivo\\arquivotest.txt");
            if (file.createNewFile()){//verifica se o método retorna true em criar o arquivo
            System.out.println("Arquivo criado com sucesso!");//printa a confirmação do arquivo criado
        }
        }catch(IOException e){//se jogar alguma exceção com a criação do arquivo, jogar na variável e 
            e.printStackTrace();//manda a exceção printar o erro, tratamento do próprio método
            throw e;
            /*
            relança a exceção para quem chamou, fez um tratamento prévio e geral, mas ainda é necessário repassar a exceção a quem chamou
            pois, cada chamada pode ter tratamentos diferentes para este erro, isso é escalabilidade de código
            */
        }
        System.out.println("--- FIM DO PROGRAMA ---");//o print ocorre, mesmo com erro, pois ele foi tratado
    }
}

/*
 * Métodos que jogam exceções checadas, exigem obrigatoriamente um tratamento em algum lugar no caminho de volta pela Stack
 */