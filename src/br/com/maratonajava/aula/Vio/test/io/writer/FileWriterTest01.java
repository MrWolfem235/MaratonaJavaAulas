package br.com.maratonajava.aula.Vio.test.io.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("File.txt");

        {
            try (FileWriter fw = new FileWriter(file)){
                fw.append("- texto adicionado "+ LocalDateTime.now().toString());

                //flush serve para liberar todos os dados no buffer antes de passar ao próximo comando
                fw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Escrita concluída com sucesso");
        }
    }
}
