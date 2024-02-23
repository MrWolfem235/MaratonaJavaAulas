package br.com.maratonajava.aula.Vio.test.nio.path;

import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Colors;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes){
        System.out.println(Colors.format("visitando arquivo -> ", Colors.YELLOW)+path.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println(Colors.format("abrindo diretório -> ", Colors.GREEN)+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println(Colors.format("fechando diretório -> ", Colors.BLUE)+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println(Colors.format("ERRO: Falha ao acessar diretório ", Colors.RED)+file.getFileName());
        return  FileVisitResult.CONTINUE;
    }
}

class treeViewFileVisitor extends SimpleFileVisitor<Path>{
    short directoryDeepLevel = 0;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(multiplyString("│   ", directoryDeepLevel)+Colors.format(file.getFileName(),Colors. GREEN));
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println(multiplyString("│   ", directoryDeepLevel)+Colors.format(dir.getFileName(), Colors.YELLOW));
        directoryDeepLevel++;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        directoryDeepLevel--;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println(multiplyString("│   ", directoryDeepLevel)+Colors.format("Erro ao ler arquivo ->"+file.getFileName(), Colors.RED));
        return FileVisitResult.CONTINUE;
    }

    private static String multiplyString (String string, int times){
        String methodResponse = "";
        for (int  i = 0 ; i < times ; i++){
            methodResponse += string;
        }
        return  methodResponse;
    }
}

public class NIOFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path testDirectory = Paths.get("src/br/com/maratonajava/aula/Vio/test/nio/path/testDirectory/pasta");

        Files.walkFileTree(testDirectory, new treeViewFileVisitor());
    }


}
