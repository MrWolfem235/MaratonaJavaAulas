package br.com.maratonajava.aula.Aprojetos.todolist.main.view.in;

import br.com.maratonajava.aula.Aprojetos.todolist.main.view.visual.Colors;
import br.com.maratonajava.aula.Aprojetos.todolist.main.view.visual.Out;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class In {
    public static Object selectOptionsValidator(Object... options){
        //printing

            System.out.print("╘════╣ OPTIONS ╠════╣ ");
            for (Object auxOptions : options) {
                System.out.print(" " + (auxOptions.toString()) + " ");
            }
            System.out.print(" ╟\n");

            //analizing
        do{
            System.out.print("Selecione uma opção: ");
            //user input
            String userResponse = new Scanner(System.in).nextLine().trim();

            for (Object auxOptions : options) {
                if (userResponse.toLowerCase().equals(auxOptions.toString().toLowerCase())) {
                    return auxOptions;
                }
            }
            System.out.println("Opção inválida!\r");
            Out.sleep(500);
        }while (true);
    }

    public static LocalDateTime dateTimeInputValidator(String pattern){
        do {
            try {
                DateTimeFormatter dateInputFormatter = DateTimeFormatter.ofPattern(pattern);
                System.out.print(Colors.format("Prazo: ",Colors.BLUE));
                String userResponse = new Scanner(System.in).nextLine();
                LocalDateTime localDateTime = LocalDateTime.parse(userResponse, dateInputFormatter);
                return localDateTime;
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido!");
                Out.sleep(500);
            }
        }while (true);
    }
}
