package br.com.maratonajava.aula.polimorfismo.test;

import br.com.maratonajava.aula.polimorfismo.service.*;
import br.com.maratonajava.aula.polimorfismo.repositorio.*;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
