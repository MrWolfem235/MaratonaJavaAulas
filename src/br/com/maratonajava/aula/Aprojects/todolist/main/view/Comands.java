package br.com.maratonajava.aula.Aprojects.todolist.main.view;

import br.com.maratonajava.aula.Aprojects.todolist.main.view.menu.MainMenu;
import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Colors;
import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Out;


import java.util.Scanner;

public class Comands {
    //initializate the scanner
    static Scanner scanner = new Scanner(System.in);
    static String userResponse;

    static String avaibleComandsInfo = "\nComandos disponíveis:\n\n create { note / task }\n hide { note / task }\n show { note / task }\n { show / hide } all\n --help\n exit";

    public static void showHelp(){
        System.out.println(avaibleComandsInfo);
        System.out.println(Colors.format("[Enter para voltar]", Colors.WHITE_BACK2));
        scanner.nextLine();
    }

    public static void exit(){
        System.exit(1);
    }

    public static void hideTasks(){
        MainMenu.setShowTasks(false);
        Out.limparTela();
    }

    public static void hideNotes(){
        MainMenu.setShowNotes(false);
        Out.limparTela();
    }

    public static void showTasks(){
        MainMenu.setShowTasks(true);
        Out.limparTela();
    }

    public static void showNotes(){
        MainMenu.setShowNotes(true);
        Out.limparTela();
    }

    public static void showAll(){
        MainMenu.setShowNotes(true);
        MainMenu.setShowTasks(true);
        Out.limparTela();
    }

    public static void hideAll(){
        MainMenu.setShowNotes(false);
        MainMenu.setShowTasks(false);
        Out.limparTela();
    }
}
