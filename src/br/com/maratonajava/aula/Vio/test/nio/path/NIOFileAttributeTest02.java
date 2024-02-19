package br.com.maratonajava.aula.Vio.test.nio.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class NIOFileAttributeTest02 {
    public static void main(String[] args) {
        System.out.println("\n\n\n");

        Path defaultPath = Paths.get("src/br/com/maratonajava/aula/Vio/test/nio/path/testDirectory");

        Path relativeFile = Paths.get("File.txt");

        Path absoluteFile = defaultPath.resolve(relativeFile);

        //creating a new file if it doesn't exists
        garanteeFileExistence(absoluteFile);

        printBasicFileAttributes(absoluteFile);

        BasicFileAttributeView basicFileAttributes = Files.getFileAttributeView(absoluteFile, BasicFileAttributeView.class);

        System.out.println("\n-----------------------\n");

        //getting a yesterday fileTime
        FileTime beforeFileTime = FileTime.from(LocalDateTime.now().minusDays(5).toInstant(ZoneOffset.UTC));

        setFileAttributeTimes(absoluteFile, null, null, beforeFileTime);

        //printing the new modified file attributes
        printBasicFileAttributes(absoluteFile);

    }

    private static void printBasicFileAttributes (Path filePath){
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            String fileName = filePath.getFileName().toString();
            FileTime creationFileTime = basicFileAttributes.creationTime();
            FileTime lastAcessFileTime = basicFileAttributes.lastAccessTime();
            FileTime lastModifiedFileTime = basicFileAttributes.lastModifiedTime();



            System.out.println(String.format("Arquivo -> %s\nCreation time -> %s\nLast acess -> %s\nLast modified -> %s", fileName, creationFileTime, lastAcessFileTime, lastModifiedFileTime));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERRRO: Falha na obtenção dos atributos do arquivo "+filePath.getFileName());
        }
    }

    private static void setFileAttributeTimes (Path filePath, FileTime modifiedTime, FileTime acessTime, FileTime creationTime){
        try {
            //getting the attributes
            BasicFileAttributes basicFileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            FileTime defaultCreationFileTime = basicFileAttributes.creationTime();
            FileTime defaultLastAcessFileTime = basicFileAttributes.lastAccessTime();
            FileTime defaultLastModifiedFileTime = basicFileAttributes.lastModifiedTime();

            //getting the attribute modifier
            BasicFileAttributeView basicFileAttributesView = Files.getFileAttributeView(filePath, BasicFileAttributeView.class);

            //if the input time is null, set the default
            basicFileAttributesView.setTimes(
                    modifiedTime != null ? modifiedTime : defaultLastModifiedFileTime,
                    acessTime != null ? acessTime : defaultLastAcessFileTime,
                    creationTime != null ? creationTime : defaultCreationFileTime
            );

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERRRO: Falha na obtenção dos atributos do arquivo "+filePath.getFileName());
        }
    }

    private static void garanteeFileExistence (Path filePath){
        if (Files.notExists(filePath)){
            try {
                Files.createFile(filePath);
                System.out.println("Novo arquivo "+filePath.getFileName()+" criado com sucesso!");
            }catch(IOException e){
                System.out.println("ERRO: Falha ao criar novo arquivo "+filePath.getFileName());
            }
        }else {
            System.out.println("Arquivo "+filePath.getFileName()+" já existe!");
        }
    }
}
