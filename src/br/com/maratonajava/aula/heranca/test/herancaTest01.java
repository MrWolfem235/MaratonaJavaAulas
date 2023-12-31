package br.com.maratonajava.aula.heranca.test;

import br.com.maratonajava.aula.heranca.domain.Endereco;
import br.com.maratonajava.aula.heranca.domain.Funcionario;
import br.com.maratonajava.aula.heranca.domain.Pessoa;

import java.sql.SQLOutput;

public class herancaTest01 {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("13222-177","R. das Flores");
        Endereco e2 = new Endereco("18999-333", "R. Adamantina");
        Pessoa p1 = new Pessoa("José","290.234.234-02", e1);
        Funcionario f1 = new Funcionario("Aldair", "243.265.253-13", e2, 3700);

        System.out.println(p1.toString());
        System.out.println(f1.toString());
    }
}
