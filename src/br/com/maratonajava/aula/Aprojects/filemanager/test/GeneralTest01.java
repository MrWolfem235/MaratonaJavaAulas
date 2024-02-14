package br.com.maratonajava.aula.Aprojects.filemanager.test;

import br.com.maratonajava.aula.Aprojects.filemanager.view.util.TerminalInput;

public class GeneralTest01 {
    public static void main(String[] args) {
        TerminalInput ti = new TerminalInput();

        while(true){
            double number = ti.onlyDigits();
            System.out.println("O número digitado foi:"+number);
        }

    }
}
