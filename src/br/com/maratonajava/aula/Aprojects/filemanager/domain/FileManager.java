package br.com.maratonajava.aula.Aprojects.filemanager.domain;

import java.io.*;
import java.nio.Buffer;

public class FileManager {
    private static File actualFile;

    public static String readFile(String path) throws IOException{
            actualFile = new File(path);
            String fileContent = "";
            try(FileReader fr = new FileReader(actualFile);
                BufferedReader br = new BufferedReader(fr)){
                String line;
                while ((line = br.readLine()) != null){
                    fileContent += line + System.lineSeparator();
                }
                return fileContent;
            }catch(FileNotFoundException e){
                throw new FileNotFoundException("ERRO: arquivo descrito não encontrado!");
            }catch(IOException e){
                throw new IOException("ERRO: erro na leitura de arquivo");
            }
    }

    public static boolean writeFile(String path, String content) throws IOException{
            actualFile = new File(path);
            String fileContent = "";
            try(FileWriter fw = new FileWriter(actualFile);
                BufferedWriter bw = new BufferedWriter(fw)){
                bw.write(content);
                return true;
            }catch(IOException e){
                throw new IOException("ERRO: erro na escrita de arquivo");
            }
    }

    public static boolean isThereArchive(String path){
        actualFile = new File(path);
        return actualFile.exists();
    }
}
