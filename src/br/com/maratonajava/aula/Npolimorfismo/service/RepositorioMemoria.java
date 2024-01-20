package br.com.maratonajava.aula.Npolimorfismo.service;

import br.com.maratonajava.aula.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio{
    @Override
    public void salvar(){
        System.out.println("Salvando na memória...");
    }
    
}
