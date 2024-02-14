package br.com.maratonajava.aula.Vio.test.io.reader;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {

        System.out.println("\n\n\n");
        //Instantiantng a new file that represents that path
        File file = new File("File.txt");

        //Using try with resources to use the closeble method from the BufferedReader and FileReader to close automatically after ending code
        try (BufferedReader br = new BufferedReader(new FileReader(file))){

            String line;
            //BufferedReader returns a null if the read line try it's the end of the file
            //So create a (while not end of the archive, read and print on terminal)
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        //catching the Reader general exception
        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }
}

//The buffered use a low-level reader as FileReader and implements functions like the buffer
//It's much more fast in reading big archives
