package br.com.maratonajava.aula.Aprojects.todolist.main.view.menu;

import br.com.maratonajava.aula.Aprojects.todolist.main.enums.InfoLevel;
import br.com.maratonajava.aula.Aprojects.todolist.main.enums.OrderList;
import br.com.maratonajava.aula.Aprojects.todolist.main.services.Acess;
import br.com.maratonajava.aula.Aprojects.todolist.main.view.ComandInterpreter;
import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Colors;
import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Format;
import br.com.maratonajava.aula.Aprojects.todolist.main.view.visual.Out;
import br.com.maratonajava.aula.Aprojects.todolist.test.PreCreateData;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        PreCreateData.init();
        init();
    }

    //GLOBAL MAIN MENU OPTIONS
    private static boolean showTasks = true;
    private static boolean showNotes = true;
    private static OrderList taskDefaultOrderList = OrderList.BY_CONCLUSION;
    private static OrderList noteDefaultOrderList = OrderList.BY_TITLE;
    private static InfoLevel taskDefaultInfoLevel = InfoLevel.MEDIUM;
    private static InfoLevel noteDefaultInfoLevel = InfoLevel.SIMPLE;

    //intializate the main menu;
    private static void init(){
        //initializate the scanner
        Scanner scanner = new Scanner(System.in);
        String userResponse;

        do {
            Out.limparTela();

            Out.print("════════════╣ To-Do-List ╠════════════\n\n");

            System.out.println(showTasks? Colors.format("\t╟ TAREFAS ╢\n", Colors.SUBLINE) + Format.formatTasksArrayList(Acess.getTasksByOrder(taskDefaultOrderList), taskDefaultInfoLevel):"");
            System.out.println(showNotes? Colors.format("\t╟ NOTAS ╢\n", Colors.SUBLINE) + Format.formatNoteArrayList(Acess.getNotesByOrder(noteDefaultOrderList), noteDefaultInfoLevel):"");
            System.out.println("Digite --help para ver os comandos disponíveis");

            //wait and receive user input
            userResponse = scanner.nextLine();

            ComandInterpreter.interpretate(userResponse);

        }while (true);
    }

    //GETTERS AND SETTERS

    public static boolean isShowTasks() {
        return showTasks;
    }

    public static void setShowTasks(boolean showTasks) {
        MainMenu.showTasks = showTasks;
    }

    public static boolean isShowNotes() {
        return showNotes;
    }

    public static void setShowNotes(boolean showNotes) {
        MainMenu.showNotes = showNotes;
    }

    public static OrderList getTaskDefaultOrderList() {
        return taskDefaultOrderList;
    }

    public static void setTaskDefaultOrderList(OrderList taskDefaultOrderList) {
        MainMenu.taskDefaultOrderList = taskDefaultOrderList;
    }

    public static OrderList getNoteDefaultOrderList() {
        return noteDefaultOrderList;
    }

    public static void setNoteDefaultOrderList(OrderList noteDefaultOrderList) {
        MainMenu.noteDefaultOrderList = noteDefaultOrderList;
    }

    public static InfoLevel getTaskDefaultInfoLevel() {
        return taskDefaultInfoLevel;
    }

    public static void setTaskDefaultInfoLevel(InfoLevel taskDefaultInfoLevel) {
        MainMenu.taskDefaultInfoLevel = taskDefaultInfoLevel;
    }

    public static InfoLevel getNoteDefaultInfoLevel() {
        return noteDefaultInfoLevel;
    }

    public static void setNoteDefaultInfoLevel(InfoLevel noteDefaultInfoLevel) {
        MainMenu.noteDefaultInfoLevel = noteDefaultInfoLevel;
    }
}
