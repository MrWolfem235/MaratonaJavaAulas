package br.com.maratonajava.aula.Oexceptions.runtime.test;

import java.io.FileNotFoundException;

import br.com.maratonajava.aula.Oexceptions.runtime.domain.*;

public class OverrideExceptionsTest01 {
    public static void main(String[] args) {
    
    Funcionario funcionario = new Funcionario();
    Pessoa pessoa = new Pessoa();

    try{
        funcionario.salvar();
        pessoa.salvar();
    }catch(FileNotFoundException e ){
        e.printStackTrace();
    }
    }
}
