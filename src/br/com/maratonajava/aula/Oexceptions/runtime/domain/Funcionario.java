package br.com.maratonajava.aula.Oexceptions.runtime.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    
    @Override
    public void salvar() throws FileNotFoundException{
        System.out.println("Funcionário: Salvando no arquivo...");
    }

}
