package br.com.maratonajava.aula.associacao.professor.test;

import br.com.maratonajava.aula.associacao.professor.domain.Escola;
import br.com.maratonajava.aula.associacao.professor.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya Sensei");
        Professor professor02 = new Professor("Kakashi Sensei");

        Escola escola = new Escola("Konoha", professor01, professor02);

        System.out.println(escola.info());
    }
}
