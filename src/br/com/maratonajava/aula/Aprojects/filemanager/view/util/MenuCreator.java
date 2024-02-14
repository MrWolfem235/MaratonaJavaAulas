package br.com.maratonajava.aula.Aprojects.filemanager.view.util;

import java.util.Scanner;

public class MenuCreator {
    private String menuName;
    private Object[] options;

    public MenuCreator(String menuName, Object[] options) {
        this.menuName = menuName;
        this.options = options;
    }

    public Object init(){
        System.out.print(getMenuView());
        Object response;
        while ((response = optionInput(true)) == null){
            System.out.print("\tOpção inválida!");
            System.out.print("\r\n╟───────┄");
        }
        return response;
    }

    private String getMenuView(){
        Out.limparTela();
        System.out.println();
        String returnString;
        returnString = String.format("╔══════════╪╡ %s ╞╪══════════╡\n║\n╠══╪╡ ", this.menuName);

        for (Object option : options){
            returnString += option.toString()+" ┄ ";
        }
        returnString += "\n║\n╙───────┄";
        return returnString;
    }

    //receive an input from user, if matches a option, return it, if not return null
    private Object optionInput (boolean caseInsensitiveInput){

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
