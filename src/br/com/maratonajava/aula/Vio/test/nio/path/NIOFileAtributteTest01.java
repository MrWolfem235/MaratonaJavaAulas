package br.com.maratonajava.aula.Vio.test.nio.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class NIOFileAtributteTest01 {
    public static void main(String[] args) {

        //setting all the paths
        Path defaultPath = Paths.get("src/br/com/maratonajava/aula/Vio/test/nio/path/testDirectory");
        Path relativeFile = Paths.get("File.txt");
        Path absoluteFile = defaultPath.resolve(relativeFile);

        //create a new file if it doesn't exists
        if (Files.notExists(absoluteFile)){
            try{
                //using resolve to include the default path
                Files.createFile(absoluteFile);
            }catch(IOException e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

        //changing the last modified date
        LocalDateTime date = LocalDateTime.now().minusYears(10);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        try {
            Files.setLastModifiedTime(absoluteFile, fileTime);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //showing the atributtes
        boolean exists = Files.exists(absoluteFile);
        boolean readable = Files.isReadable(absoluteFile);
        boolean writtable = Files.isWritable(absoluteFile);
        boolean executable = Files.isExecutable(absoluteFile);
        try {
            fileTime = Files.getLastModifiedTime(absoluteFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(String.format("Arquivo: %s\nExiste? %s\nPode ser lido? %s\nPode ser escrito? %s\nPode ser executado? %s\nÚltima modificação: %s", absoluteFile.getFileName(), exists, readable, writtable, executable, fileTime.toString()));

    }
}
