package br.com.maratonajava.aula.Aprojetos.todolist.test;

import br.com.maratonajava.aula.Aprojetos.todolist.main.view.visual.Colors;
import br.com.maratonajava.aula.Aprojetos.todolist.main.view.visual.Out;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateTimeFormattterTest01 {
    public static void main(String[] args) {
        dateTimeInputValidator();
    }

    public static String dateTimeInputValidator(){
        do {
            try {
                DateTimeFormatter dateInputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss");
                System.out.print(Colors.format("Prazo: ",Colors.BLUE));
                String userResponse = new Scanner(System.in).nextLine();
                LocalDateTime tempDeadLine = LocalDateTime.parse(userResponse, dateInputFormatter);
                return userResponse;
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido!");
                Out.sleep(500);
            }
        }while (true);
    }
}
