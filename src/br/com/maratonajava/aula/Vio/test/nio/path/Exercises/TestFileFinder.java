package br.com.maratonajava.aula.Vio.test.nio.path.Exercises;

import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Colors;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class TestFile extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path rootProjectPath = Paths.get("C:\\Users\\josiv\\OneDrive\\Documentos\\Java Projects\\Maratona Java");
        file = rootProjectPath.resolve(file);
        if (isTestFile(file)){
            System.out.println(Colors.format("- FILE ", Colors.GREEN)+file.getFileName()+Colors.format(" PATH ", Colors.YELLOW)+rootProjectPath.relativize(file));
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    private boolean isTestFile (Path file){
        String glob = "glob:**/*test*.{java,class}";
        return FileSystems.getDefault().getPathMatcher(glob).matches(file);
    }
}

public class TestFileFinder {

    public static void main(String[] args) {
        SimpleFileVisitor<Path> testFileFinderFileVisitor = new TestFile();
        Path path = Paths.get("src");
        try {
            Files.walkFileTree(path, testFileFinderFileVisitor);
        }catch (IOException e){
            System.out.println("ERRO: Falha ao procurar arquivos");
            e.printStackTrace();
        }
    }
}
