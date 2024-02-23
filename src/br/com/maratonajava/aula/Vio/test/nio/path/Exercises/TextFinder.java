package br.com.maratonajava.aula.Vio.test.nio.path.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class TxtFileFinder extends SimpleFileVisitor<Path>{
    List<Path> txtFiles = new LinkedList<Path>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (isTxtFile(file)){
            txtFiles.add(file);
        }
        return FileVisitResult.CONTINUE;
    }

    private boolean isTxtFile(Path fileToVerify){
        String txtGlob
                = "glob:**/*.txt";
        PathMatcher txtPathMatcher = FileSystems.getDefault().getPathMatcher(txtGlob);
        return txtPathMatcher.matches(fileToVerify);
    }

    public List<Path> getTxtFilesList (){
        return txtFiles;
    }
}

public class TextFinder {

    public static void main(String[] args) {
        while (true){
            initRequisition();
        }
    }

    private static void initRequisition (){
        System.out.print("Olá! Digite um caminho para procurar por arquivos .txt\n\t-> ");
        String userInput = new Scanner(System.in).nextLine().trim();
        Path userInputPath = Paths.get(userInput).normalize();
        System.out.println("Procurando no caminho: "+userInputPath.toString());
        showFilesSearchResults(getTxtFiles(userInputPath));
        System.out.println("[Enter para continuar]");
        new Scanner(System.in).nextLine();
    }

    private static List<Path> getTxtFiles (Path pathToSearch){
        TxtFileFinder txtFileFinder = new TxtFileFinder();
        try {
            Files.walkFileTree(pathToSearch, txtFileFinder);
            return  txtFileFinder.getTxtFilesList();
        }catch (IOException exc){
            System.out.println("ERRO: Falha ao procurar arquivos .txt no caminho "+pathToSearch.getFileName());
            return null;
        }
    }

    private static void showFilesSearchResults(List<Path> txtFileList){
        int txtFilesQtd = txtFileList.size();
        System.out.println("--------- RESULTADO ---------");
        System.out.println(txtFileList.size()+" arquivos de texto encontrados!");
        for (Path txtFile : txtFileList){
            showTxtFileInfo(txtFile);
        }
        System.out.println("Os arquivos de texto contém no total "+ getListTextLinesQtd(txtFileList)+" linhas!");
    }

    private static void showTxtFileInfo (Path txtFile){
        int txtFileLineQtd = getTextLinesQtd(txtFile);
        System.out.println(txtFile.getFileName()+" Contém "+txtFileLineQtd+" linhas\n");
    }

    private static int getListTextLinesQtd (List<Path> txtFileList){
        int txtFilesLines = 0;
        for (Path txtFile : txtFileList){
            txtFilesLines += getTextLinesQtd(txtFile);
        }
        return txtFilesLines;
    }

    private static int getTextLinesQtd (Path txtFile){
        String textLine;
        int linesQtd = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(txtFile.toFile()));
            while (bufferedReader.readLine() != null) {
                linesQtd++;
            }
        }catch(IOException exc){
            System.out.println("ERRO: Arquivo de texto "+txtFile.getFileName()+" não encontrado");
        }
        return linesQtd;
    }

}
