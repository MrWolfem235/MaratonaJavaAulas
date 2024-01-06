package br.com.maratonajava.aula.polimorfismo.service;

import br.com.maratonajava.aula.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar(){
        System.out.println("Salvando no banco de dados...");
    }
    
}
