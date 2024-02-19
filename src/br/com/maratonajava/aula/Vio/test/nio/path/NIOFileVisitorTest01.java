package br.com.maratonajava.aula.Vio.test.nio.path;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListFiles extends SimpleFileVisitor<Path> {
    /*
    @param path the path used to visit
    @param basicFileAttributes attributes to use in the methods
    @return return the result based on the logic into the method
     */

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes){
        if (path.getFileName().toString().endsWith(".java")) {
            System.out.println(path.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class NIOFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path projectRootPath = Paths.get(".");
        Files.walkFileTree(projectRootPath, new ListFiles());
    }
}
