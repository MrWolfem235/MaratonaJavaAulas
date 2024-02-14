package br.com.maratonajava.aula.Vio.test.nio.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZoneOffset;

public class PathTest01 {
    public static void main(String[] args) {
        Path testDirectoryPath = Paths.get("C:","Users","josiv","OneDrive","Documentos","Java Projects","Maratona Java","src","br","com","maratonajava","aula","Vio","test","nio","path","testDirectory");
        Path file = Paths.get(testDirectoryPath.toString(), "file.txt");
        String fileInfo = fileInfo(file);

        //if the file not exist, create a new
        if (!Files.exists(file)){
            try {
                fileInfo = fileInfo(Files.createFile(file));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println(fileInfo);
    }

    private static String fileInfo(Path file){
        try {
            return String.format("Nome: %s\nPasta pai: %s\nRoot: %s\nExiste? %s \nÉ um diretório? %s\nÉ executável? %s\nÚltima modificação: %s\nDono: %s",file.getFileName(), file.getParent(), file.getRoot(), Files.exists(file), Files.isDirectory(file), Files.isExecutable(file), Files.getLastModifiedTime(file).toInstant().atOffset(ZoneOffset.of("-3")), Files.getOwner(file, LinkOption.NOFOLLOW_LINKS));
        } catch (IOException e) {
            throw new RuntimeException("ERRO: Erro ao mostrar informações!");
        }
    }

    private static boolean createFile(Path filePaht) throws IOException {
        try{
            Files.createFile(filePaht);
            return Files.exists(filePaht);
        }catch(IOException e){
            throw new IOException("ERRO: Erro ao criar o arquivo "+filePaht.getFileName());
        }
    }

    private static boolean deleteFile(Path file) throws IOException {
        return Files.deleteIfExists(file);
    }

    private static boolean createDirectory(Path directoryPath) throws IOException{
        try {
            Files.createDirectory(directoryPath);
            Files.exists(directoryPath);
            return true;
        } catch (IOException e) {
            throw new RuntimeException("ERRO: Erro ao criar o diretório "+directoryPath.getFileName());
        }
    }


}
