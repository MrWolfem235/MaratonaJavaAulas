package br.com.maratonajava.aula.Vio.test.nio.path;

import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Colors;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

public class NIOFileStreamTest01 {
    public static void main(String[] args) {
        //setting the paths
        String fileName = "File.txt";
        Path rootPath = Paths.get("/");
        Path iOProjectsPath = Paths.get("src/br/com/maratonajava/aula/Vio/test");
        Path outrosProjetosJava = Paths.get("/Users/josiv/OneDrive/Documentos/Java Projects/Outros projetos java");
        Path defaultPath = Paths.get("src/br/com/maratonajava/aula/Vio/test/nio/path/testDirectory");
        Path relativeFilePath = Paths.get(fileName);
        Path absoluteFile = Paths.get(defaultPath.resolve(relativeFilePath).toString());

        //executing
        System.out.println(getDirectoryStream(outrosProjetosJava, true));

    }

    //return a string with a tree of all directories if recursive is true
    private static String getDirectoryStream (Path directoryPath, boolean recursive){
        return getStream(directoryPath, recursive, 0);
    }


    private static String getStream (Path directoryPath, boolean recursive, int directoryDeepLevel){
        try {
            //initialize the response
            String methodResponse = "";

            //The DirectoryStream is like an array, that put every object in a variable in clas <Path>, this method came in a generic class
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath);

            //iterating over the directory stream
            for (Path path : directoryStream){
                String nubmerOfTabs = multiplyString("│   ", directoryDeepLevel);
                if (Files.isDirectory(path)){
                    //if directory
                    methodResponse += nubmerOfTabs + Colors.format(path.getFileName(), Colors.YELLOW)
                            //if recursive, initiate get the stream of the directory
                            + (recursive ? "──┐\n" + getStream(path, true, directoryDeepLevel + 1) : "");
                }else{
                    //if file
                    methodResponse += nubmerOfTabs + Colors.format(path.getFileName(), Colors.GREEN) + "\n";
                }
            }
            return methodResponse;
        }catch (IOException e){
            System.out.println("ERRO: Falha na obtenção do stream de diretórios");
        }
        return null;
    }

    private static String getDosFileAttributes (Path filePath){
        try {
            //getting the DOS file attribute reader
            DosFileAttributes dosFileAttributes = Files.readAttributes(filePath, DosFileAttributes.class);

            //creating local attribute info
            String fileName = filePath.getFileName().toString();
            FileTime created = dosFileAttributes.creationTime();
            FileTime modified = dosFileAttributes.lastModifiedTime();
            FileTime acessed = dosFileAttributes.lastAccessTime();

            //printing attributes info
            if (Files.isDirectory(filePath)){
                return String.format("%s -Create- %s -Modified- %s -Acessed- %S\n", Colors.format(fileName, Colors.YELLOW), Colors.format(created, Colors.BLUE), Colors.format(modified, Colors.BLUE), Colors.format(acessed, Colors.BLUE));
            }
            return String.format("%s -Create- %s -Modified- %s -Acessed- %S\n",Colors.format(fileName, Colors.GREEN), Colors.format(created, Colors.BLUE), Colors.format(modified, Colors.BLUE), Colors.format(acessed, Colors.BLUE));
        }catch (IOException e){
            System.out.println("ERRO: Falha ao imprimir informações de atributos DOS do arquivo "+filePath.getFileName());
        }
        return null;
    }

    private static String multiplyString (String string, int times){
        String methodResponse = "";
        for (int  i = 0 ; i < times ; i++){
            methodResponse += string;
        }
        return  methodResponse;
    }
}
