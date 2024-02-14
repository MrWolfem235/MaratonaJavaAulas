package br.com.maratonajava.aula.Aprojects.filemanager.view;

import br.com.maratonajava.aula.Aprojects.filemanager.domain.FileManager;
import br.com.maratonajava.aula.Aprojects.filemanager.view.util.Colors;
import br.com.maratonajava.aula.Aprojects.filemanager.view.util.MenuCreator;
import br.com.maratonajava.aula.Aprojects.filemanager.view.util.TerminalInput;

import java.io.IOException;

public class Interface {
    static MenuCreator MainMenu = new MenuCreator("File Manager", new Object[]{"Leitura", "Escrita", "Sair"});
    static TerminalInput tInput = new TerminalInput();

    public void init(boolean debugMode){


        do{
            switch (MainMenu.init().toString()){
                case "Leitura":
                    readOption();
                    break;
                case "Escrita":
                    writeOption();
                    break;
                case "Sair":
                    System.out.println("\n\nAté logo!!!");
                    System.exit(1);
            }
        }while (true);
    }

    private void readOption(){
        System.out.println("Descreva o caminho do arquivo");
        try {
            System.out.println("━━━━━━━━━╾ Arquivo ╼━━━━━━━━━\n\n"+FileManager.readFile(tInput.anyInput())+"╼━━━━━━━━━━━━━━━━━━━━━━━━━━━╾\n\n");
        }catch (IOException e){
            System.out.println("\n"+e.getMessage()+"\n");
        }
        tInput.enterToContinue();
    }

    private void writeOption(){
        String tempFileName;
        String tempFileContent;

        System.out.println("Digite o nome e o caminho do arquivo");
        tempFileName = tInput.anyInput();
        System.out.println(FileManager.isThereArchive(tempFileName)? Colors.format("\n╳ Sobrescrevendo Arquivo ✎ ╳\n", Colors.YELLOW):"");

        System.out.println("Digite o conteúdo do arquivo [somente 0 para concluir]\n");
        tempFileContent = tInput.textInput();

        try{
            FileManager.writeFile(tempFileName, tempFileContent);
        }catch (IOException e){
            System.out.println("\n"+e.getMessage()+"\n");
        }

        System.out.println("Escrita concluída!!!\n\n");

    }

}
