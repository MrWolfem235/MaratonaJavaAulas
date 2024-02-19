package br.com.maratonajava.aula.Vio.test.nio.path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;

public class NIOPosixFileAttributeTest01 {
    public static void main(String[] args) {
        //Getting the paths
        String fileName = "File.txt";
        Path defaultPath = Paths.get("src/br/com/maratonajava/aula/Vio/test/nio/path/testDirectory");
        Path relativeFilePath = Paths.get(fileName);
        Path file = Paths.get(defaultPath.resolve(relativeFilePath).toString());

        //Getting the reader and
        PosixFileAttributes posixFileAttributeReader;
        PosixFileAttributeView posixFileAttributeModifier;
        try {
            posixFileAttributeReader = Files.readAttributes(file, PosixFileAttributes.class);
            posixFileAttributeModifier = Files.getFileAttributeView(file, PosixFileAttributeView.class);

            //testing the File.txt Posix permissions
            System.out.println(String.format("File: %s\nPath: %s\nPermissions: %s\nOwner: %s\nGroup: %s",fileName, file.toAbsolutePath(),posixFileAttributeReader.permissions().toString(), posixFileAttributeReader.owner(), posixFileAttributeReader.group()));

        }catch(UnsupportedOperationException e){
            System.out.println("ERRO: Sistema operacional inválido para leitura de permissões Posix!\n");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("ERRO: Erro ao gerar leitores e modificadores de atributos Posix\n"+e.getMessage());
            e.printStackTrace();
        }

    }
}
