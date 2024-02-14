package br.com.maratonajava.aula.Aprojects.filemanager.view.util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TerminalInput {

    static final String onlyDigitRegex = "(^)( )*(\\d)+( )*($)";

    Scanner scanner = new Scanner(System.in);
    String userResponse;

    public String anyInput(){
        System.out.print("\r\n╟───────┄");
        userResponse = scanner.nextLine();
        return userResponse;
    }

    public double onlyDigits(){
        String returnString;

        System.out.print("\r\n╟───────┄");

        while ((returnString = verifyMatch(scanner.nextLine(), onlyDigitRegex)) == null){
            System.out.print("\tApenas números!");
            System.out.print("\r\n╟───────┄");
        }
        return Double.parseDouble(returnString);
    }

    public String textInput(){
        String tempFileName;
        String tempFileContent = "";
        String inputLine = "";

        while (!inputLine.equals("0")){
            tempFileContent += inputLine;
            inputLine = new Scanner(System.in).nextLine();
            tempFileContent += System.lineSeparator();
        }

        return tempFileContent;
    }

    public void enterToContinue(){
        System.out.println(Colors.format("[Enter para continuar]",Colors.WHITE_BACK2));
        scanner.nextLine();
    }

    //if finds return that, if not return null
    private String verifyMatch(String string, String pattern){
        Matcher matcher = Pattern.compile(pattern).matcher(string);
        return matcher.find()? matcher.group() : null ;
    }

}
