package br.com.maratonajava.aula.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {

            boolean isCreated = file.createNewFile();
            boolean isFile = file.isFile();
            boolean isDirectory = file.isDirectory();
            boolean exists = file.exists();
            boolean isReadeble = file.canRead();
            boolean isWriteble = file.canWrite();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ss:MM:HH dd/MM/YYYY z");

            System.out.println(exists?"This exists!":"This doesn't exists!");
            System.out.println(isFile?"This is a File":"This is a directory");
            System.out.println(isCreated?"The file was created!":"This was already created!");
            System.out.println(isReadeble?"This can be readed":"This can't be readed"+(isWriteble?" and writed":""));
            System.out.println("last modify: "+dtf.format(LocalDateTime.ofEpochSecond(file.lastModified()/1000,0, ZoneOffset.of("-0")).atZone(ZoneId.of("America/Sao_Paulo"))));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
