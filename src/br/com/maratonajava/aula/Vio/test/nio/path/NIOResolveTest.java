package br.com.maratonajava.aula.Vio.test.nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

//Resolver um caminho é converter um caminho absoluto ou relativo num caminho absoluto para ser acessado pelo sistema operacional

//um caminho relativo é dito começando sem barra, se referindo ao caminho apartir do contexto onde está sendo executado
//Ex.: /users/mr.wolfem/ ~ cd documents/archives
//-> /users/mr.wolfem/documents/archives
//um caminho absoluto é contando apartir da raíz dos diretórios no sistema operacional
public class NIOResolveTest {
    public static void main(String[] args) {
        Path absolutePath = Paths.get("/mnt/user/mrwolfem");
        Path relativePath = Paths.get("documents/study things");

        System.out.println("\n\n\n");
        System.out.println("Caminho absoluto: "+absolutePath);
        System.out.println("Caminho relativo: "+relativePath);

        //resolvendo um caminho relativo usando o caminho absoluto, retornando o caminho completo desde a raíz até onde o caminho relativo menciona
        System.out.println("absoluto + relativo: "+absolutePath.resolve(relativePath).toString());

        //ao tentar resolver um caminho absoluto com um caminho relativo, é retornado o próprio caminho absoluto
        // pois este já está resolvido e não necessita de alterações
        System.out.println("relativo + absoluto: "+relativePath.resolve(absolutePath).toString());
    }
}
