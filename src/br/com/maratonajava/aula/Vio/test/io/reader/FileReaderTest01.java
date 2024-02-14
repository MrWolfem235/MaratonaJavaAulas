package br.com.maratonajava.aula.Vio.test.io.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("File.txt");
        try (FileReader fr = new FileReader(file)){
            char[] readerInput = new char[100];
            fr.read(readerInput);

            for (char character : readerInput){
                System.out.print((char) character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
