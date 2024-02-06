package br.com.maratonajava.aula.Aprojetos.todolist.main.view.menu;

import br.com.maratonajava.aula.Aprojetos.todolist.main.enums.Category;
import br.com.maratonajava.aula.Aprojetos.todolist.main.enums.Priority;
import br.com.maratonajava.aula.Aprojetos.todolist.main.services.Create;
import br.com.maratonajava.aula.Aprojetos.todolist.main.view.in.In;
import br.com.maratonajava.aula.Aprojetos.todolist.main.view.visual.Colors;
import br.com.maratonajava.aula.Aprojetos.todolist.main.view.visual.Out;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CreationMenu {

    //initializate the scanner
    static Scanner scanner = new Scanner(System.in);
    static String userResponse;

    public static void task(){
        Out.limparTela();
            System.out.println("\t═════════════╪╣ CRIAR TAREFA ╠╪═════════════\n\n");
            System.out.print(Colors.format("Título: ",Colors.BLUE));
            String tempTitle = scanner.nextLine().trim();

            System.out.print(Colors.format("\nDescrição: ",Colors.BLUE));
            String tempDescription = scanner.nextLine().trim();

            System.out.print(Colors.format("\nCategoria: ",Colors.BLUE));
            Category tempCategory = (Category) In.selectOptionsValidator(Category.values());

            System.out.print(Colors.format("\nPrioridade: ",Colors.BLUE));
            Priority tempPriority = (Priority) In.selectOptionsValidator(Priority.values());


            System.out.println("\nDigite no seguinte formato dd/MM/yyyy HH:mm");

            LocalDateTime tempDeadLine = In.dateTimeInputValidator("dd/MM/yyyy HH:mm");

            //creating a new task
            Create.task(tempTitle,tempDescription,tempCategory,tempPriority,tempDeadLine);
    }

    public static void note(){
        Out.limparTela();
        System.out.println("\t═════════════╪╣ CRIAR NOTA ╠╪═════════════\n\n");

        System.out.print(Colors.format("Título: ",Colors.BLUE));
        String tempTitle = scanner.nextLine().trim();

        System.out.print(Colors.format("\nDescrição: ",Colors.BLUE));
        String tempDescription = scanner.nextLine().trim();

        //creating a new note
        Create.note(tempTitle, tempDescription);
    }
}