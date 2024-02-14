package br.com.maratonajava.aula.Vio.test.io.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("File.txt");

        {
            try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)){
                bw.write("Escrito pelo Buffered writer, Teste 1, 2, 3...");
                bw.newLine();
                bw.write("Nova linha separada pelo Buffered Writer");
                bw.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Escrita concluída com sucesso");
        }
    }
}
