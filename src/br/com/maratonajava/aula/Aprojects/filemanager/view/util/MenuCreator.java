package br.com.maratonajava.aula.Aprojects.filemanager.view.util;

import java.util.Scanner;

public class MenuCreator {
    private String menuName;
    private Object[] options;

    public MenuCreator(String menuName, Object[] options) {
        this.menuName = menuName;
        this.options = options;
    }

    //controller
    public Object init(){
        displayMenuView(options);
        return receiveAndValidateInput(options);
    }

    //view
    private void displayMenuView(Object[] options){
        Out.limparTela();
        System.out.println();
        String menuDisplay;
        menuDisplay = String.format("╔══════════╪╡ %s ╞╪══════════╡\n║\n╠══╪╡ ", this.menuName);

        for (Object option : options){
            menuDisplay += option.toString()+" ┄ ";
        }
        menuDisplay += "\n║\n╙───────┄";
        System.out.println(menuDisplay);
    }

    //services
    private Object receiveAndValidateInput (Object[] options){
        Object response;
        while ((response = optionInput(true, options)) == null){
            System.out.print("\tOpção inválida!");
            System.out.print("\r\n╟───────┄");
        }
        return  response;
    }

    private Object optionInput (boolean caseInsensitiveInput, Object[] options){

        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.nextLine().trim();

        for (Object option : options){

            if (caseInsensitiveInput?
            userResponse.toLowerCase().equals(option.toString().toLowerCase().trim())://case insensitive input
            userResponse.equals(option.toString().trim())){

                return option;

            }
        }
        return null;
    }
}
