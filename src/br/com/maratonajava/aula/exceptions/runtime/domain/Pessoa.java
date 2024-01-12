package br.com.maratonajava.aula.exceptions.runtime.domain;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Pessoa {

    public void salvar() throws FileNotFoundException {
        throw new FileNotFoundException();
        // System.out.println("Pessoa: Salvando no arquivo...");
    }

}
