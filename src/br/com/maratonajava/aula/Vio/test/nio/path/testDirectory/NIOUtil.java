package br.com.maratonajava.aula.Vio.test.nio.path.testDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NIOUtil {

    static public boolean createDirectory(Path directoryPath){
        System.out.println("Criando diretório "+directoryPath.getFileName()+"...");
        if (Files.notExists(directoryPath)){
            try{
                Files.createDirectories(directoryPath);
                System.out.println("\tDiretório "+directoryPath.getFileName()+" criado com sucesso!!!");
                return true;
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("\tERRO: Erro na criação do diretório padrão ->"+e.getMessage());
            }
        }
        System.out.println("\tDiretório "+directoryPath.getFileName()+" já existe");
        return false;

    }

    static public boolean createFile(Path filePath){
        System.out.println("Criando arquivo "+filePath.getFileName()+"...");
        if(Files.notExists(filePath)){
            try {
                Files.createFile(filePath);
                System.out.println("\tArquivo "+filePath.getFileName()+" criado com sucesso!!!");
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("\tERRO: Erro na criação do arquivo -> "+e.getMessage());
            }
        }
        System.out.println(String.format("\tArquivo %s já existe", filePath.getFileName()));
        return true;
    }

    static public boolean copyFile (Path sourcePath, Path targetPath){
        System.out.println("Copiando "+sourcePath.getFileName()+" para "+targetPath.getFileName()+"...");
        try {
            if( Files.notExists(targetPath)){
                Files.copy(sourcePath, targetPath);
                System.out.println("\tArquivo "+sourcePath.getFileName()+" copiado para "+targetPath.getFileName()+" com sucesso!!!");
            }else{
                Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("\tNovo arquivo "+sourcePath.getFileName()+" copiado, sobrescrito em "+targetPath.getFileName()+" com sucesso!!!");
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("\tERRO: Erro durante a cópia do arquivo -> "+e.getMessage());
        }
        return false;
    }
}
