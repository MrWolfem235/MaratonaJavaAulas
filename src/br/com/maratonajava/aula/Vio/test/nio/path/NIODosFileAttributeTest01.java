package br.com.maratonajava.aula.Vio.test.nio.path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class NIODosFileAttributeTest01 {
    public static void main(String[] args) {
        Path defaultPath = Paths.get("src/br/com/maratonajava/aula/Vio/test/nio/path/testDirectory");

        Path relativeFilePath = Paths.get("File.txt");

        Path absoluteFile = defaultPath.resolve(relativeFilePath);

        garanteeFileExistence(absoluteFile);

        printDosFileAttributes(absoluteFile);

        System.out.println("\n-----------------------------\n");

        setDosFileAttributes(absoluteFile, true, true);

        printDosFileAttributes(absoluteFile);

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

    private static void setDosFileAttributes (Path filePath, boolean isHidden, boolean isReadOnly){
        try {
            //getting the DOS file attribute modifier
            DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(filePath, DosFileAttributeView.class);

            //setting the attributes values
            dosFileAttributeView.setHidden(isHidden);
            dosFileAttributeView.setReadOnly(isReadOnly);

        }catch (IOException e){
            System.out.println("ERRO: Falha ao setar atributos DOS do arquivo "+filePath.getFileName());
        }
    }

    private static void printDosFileAttributes (Path filePath){
        try {
            //getting the DOS file attribute reader
            DosFileAttributes dosFileAttributes = Files.readAttributes(filePath, DosFileAttributes.class);

            //creating local attribute info
            String fileName = filePath.getFileName().toString();
            boolean isHidden = dosFileAttributes.isHidden();
            boolean isReadOnly = dosFileAttributes.isReadOnly();

            //printing attributes info
            System.out.println(String.format("Arquivo -> %s\n%s\n%s",
                    fileName,
                    isHidden ? "O arquivo esta oculto" : "O arquivo está visível",
                    isReadOnly ? "O arquivo está somente para leitura" : "O arquivo não está somente para leitura"
                    ));
        }catch (IOException e){
            System.out.println("ERRO: Falha ao imprimir informações de atributos DOS do arquivo "+filePath.getFileName());
        }
    }
}
