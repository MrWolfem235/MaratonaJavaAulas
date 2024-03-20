package br.com.maratonajava.aula.WSerialization.test;

import br.com.maratonajava.aula.WSerialization.domain.Character;
import br.com.maratonajava.aula.WSerialization.domain.ChrType;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharacterTest01{
    public static void main(String[] args) {
        Path serialPath = Paths.get("src/br/com/maratonajava/aula/WSerialization/dir");
        Path serialName = Paths.get("serial.ser");
        Path absoluteSerialPath = serialPath.resolve(serialName);
//        Character chr1 = new Character("Bartz", 9560, 537, ChrType.MAIN_CHARACTER);
//        serializate(serialPath, chr1);
        System.out.println(((Character) deserializate(absoluteSerialPath)).toString());
    }

    private static void serializate (Path serialPath, Object object){
        Path serialName = Paths.get("serial.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(serialPath.resolve(serialName )))){
            oos.writeObject(object);
        }catch (IOException e){
            System.out.println("ERRO: Falha em 'serializate'\n\tserialPath -> "+serialPath+"\n\tobject -> "+object.toString());
            e.printStackTrace();
        }
        System.out.println("Serialização concluída em "+serialPath+"!");
    }

    private static Object deserializate (Path serialPath){
        try(ObjectInputStream oos = new ObjectInputStream ( Files.newInputStream(serialPath))){
            return oos.readObject();
        }catch (ClassNotFoundException e){
            System.out.println("ERRO: Classe do serial não encontrada em 'deserializate' \n\tserialPath -> "+serialPath);
            return null;
        }catch (IOException e){
            System.out.println("ERRO: Falha em 'deserializate' \n\tserialPath -> "+serialPath);
            e.printStackTrace();
            return null;
        }
    }
}
