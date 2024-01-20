package br.com.maratonajava.aula.Npolimorfismo.service;

import br.com.maratonajava.aula.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar(){
        System.out.println("Salvando no banco de dados...");
    }
    
}
