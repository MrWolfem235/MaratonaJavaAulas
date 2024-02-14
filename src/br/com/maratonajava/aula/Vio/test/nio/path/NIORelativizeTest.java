package br.com.maratonajava.aula.Vio.test.nio.path;

import br.com.maratonajava.aula.Vio.test.nio.path.utils.Colors;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NIORelativizeTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("/C/Users/josiv/Documentos");
        Path path2 = Paths.get("Documentos/Java Projects/Maratona Java");
        Path path3 = Paths.get("/C/Windows/System32/setup");
        Path path4 = Paths.get("/C/Users/josiv/Pictures/Screenshots");
        Path path5 = Paths.get("/C/Windows/System32/setup/languages/settings");

        Path[] paths = {path1, path2, path3, path4, path5};

        int indexCount = 1;
        for (Path pathFrom : paths){
            for (Path pathTo : paths){
                if (pathFrom == pathTo){ continue; }
                try{
                    System.out.println(indexCount+" relativize from "+ Colors.format(pathFrom,Colors.GREEN)+" to "+Colors.format(pathTo,Colors.GREEN)+" -> "+Colors.format(pathFrom.relativize(pathTo).toString(),Colors.BLUE));
                }catch (IllegalArgumentException e){
                    System.out.println(indexCount+" relativize from "+ Colors.format(pathFrom,Colors.GREEN)+" to "+Colors.format(pathTo,Colors.GREEN)+" -> Impossible to find a way...");
                }
                indexCount++;
            }
        }


    }
}
