package br.com.maratonajava.aula.Vio.test.nio.path;

import br.com.maratonajava.aula.Vio.test.nio.path.testDirectory.NIOUtil;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOTest01 {
    public static void main(String[] args) {
        //setting default paths
        Path NIORootPath = Paths.get("C:","Users","josiv","OneDrive","Documentos","Java Projects","Maratona Java","src","br","com","maratonajava","aula","Vio","test","nio","path");

        Path defaultDirectory = Paths.get(NIORootPath.toString(), "testDirectory");

        //setting file path
        String fileName = "File.txt";

        Path filePath = Paths.get(defaultDirectory.toString(), fileName);

        //setting copiedFile path
        String copiedFileName = "CopiedFile.txt";

        Path copiedFilePath = Paths.get(defaultDirectory.toString(), copiedFileName);


        //executing...
        NIOUtil.createDirectory(defaultDirectory);

        NIOUtil.createFile(filePath);

        NIOUtil.copyFile(filePath, copiedFilePath);
    }
}
