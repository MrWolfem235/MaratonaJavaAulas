package br.com.maratonajava.aula.Aprojetos.todolist.main.view;

import br.com.maratonajava.aula.Aprojetos.todolist.main.view.menu.CreationMenu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//interpratate string comands and execute it's respective method
public class ComandInterpreter {
    //initializate the scanner
    static Scanner scanner = new Scanner(System.in);
    static String userResponse;


    //setting up a map (regex, the method that it execute)
    static Map<String, Runnable> regexMap = new HashMap();

    //creting strings that remain the regex code for each comand
    static String createTaskRegex = "( |^)create( )task( |$)";
    static String createNoteRegex = "( |^)create( )note( |$)";
    static String helpRegex = "( |^)--help( |$)";
    static String exitRegex = "( |^)exit( |$)";
    static String hideTasksRegex = "( |^)hide( )tasks( |$)";
    static String hideNotesRegex = "( |^)hide( )notes( |$)";
    static String showTasksRegex = "( |^)show( )tasks( |$)";
    static String showNotesRegex = "( |^)show( )notes( |$)";
    static String hideAllRegex = "( |^)hide( )all( |$)";
    static String showAllRegex = "( |^)show( )all( |$)";

    //entry the regex - value in the map by a static initializator
    static {
        regexMap.put(createTaskRegex, CreationMenu::task);
        regexMap.put(createNoteRegex, CreationMenu::note);
        regexMap.put(helpRegex, Comands::showHelp);
        regexMap.put(exitRegex, Comands::exit);
        regexMap.put(hideTasksRegex, Comands::hideTasks);
        regexMap.put(hideNotesRegex, Comands::hideNotes);
        regexMap.put(showTasksRegex, Comands::showTasks);
        regexMap.put(showNotesRegex, Comands::showNotes);
        regexMap.put(hideAllRegex, Comands::hideAll);
        regexMap.put(showAllRegex, Comands::showAll);
    }

    //initializate regex resources
    static Pattern pattern;
    static Matcher matcher;

    public static boolean interpretate(String userComand){
        //iterate over the map
        for (Map.Entry<String, Runnable> entry : regexMap.entrySet()){
            //prepare matcher for validate the match
            matcher = Pattern.compile(entry.getKey()).matcher(userComand);
            //if the user Comand matches with one of the comands regex execute it
            if (matcher.find()){
                //executing the keeped method
                entry.getValue().run();
                return true;
            }
        }
        return false;
    }


}
