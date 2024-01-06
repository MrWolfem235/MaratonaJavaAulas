package br.com.maratonajava.aula.polimorfismo.service;

import br.com.maratonajava.aula.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar(){
        System.out.println("Salvando na memória...");
    }
    
}
