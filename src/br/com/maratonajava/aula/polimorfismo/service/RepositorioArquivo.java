package br.com.maratonajava.aula.polimorfismo.service;

import br.com.maratonajava.aula.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio{
    @Override
    public void salvar(){
        System.out.println("Salvando num arquivo...");
    }
}
