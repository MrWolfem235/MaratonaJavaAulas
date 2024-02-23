package br.com.maratonajava.aula.Vio.test.io;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("br/com/maratonajava/aula/Vio/test/nio/path/testDirectory/pasta/arquivo.zip");
        Path filesToZip = Paths.get("src/br/com/maratonajava/aula/Vio/test/nio/path/testDirectory/pasta/subpasta1/subsubpasta1/");
        zipFile(zipFile, filesToZip );
    }

    private static boolean zipFile (Path zipFilePath , Path filesDirectoryToZip){
        try(ZipOutputStream zipStream = new ZipOutputStream( Files.newOutputStream(zipFilePath));
            DirectoryStream<Path> filesToZipDirectoryStream = Files.newDirectoryStream(filesDirectoryToZip)){
            for (Path file : filesToZipDirectoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Arquivo zip "+zipFilePath.getFileName()+" Criado com sucesso em "+zipFilePath.toString());
            return true;
        }catch (NoSuchFileException e){
            System.out.println("ERRO: caminho do zip ou dos arquivos inválido ou não encontrado!\nZip path -> "+zipFilePath.toString()+"\nFiles to zip path -> "+filesDirectoryToZip.toString());
            e.printStackTrace();
            return false;
        }catch (IOException e) {
            System.out.println("ERRO: Falha ao criar arquivo zip");
            e.printStackTrace();
            return false;
        }
    }
}
