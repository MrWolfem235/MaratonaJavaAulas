package br.com.maratonajava.aula.Npolimorfismo.test;

import br.com.maratonajava.aula.Npolimorfismo.repositorio.*;
import br.com.maratonajava.aula.Npolimorfismo.service.*;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
