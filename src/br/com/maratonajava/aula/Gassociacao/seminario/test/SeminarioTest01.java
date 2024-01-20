package br.com.maratonajava.aula.Gassociacao.seminario.test;

import java.sql.SQLOutput;

import br.com.maratonajava.aula.Gassociacao.seminario.domain.*;

public class SeminarioTest01 {
    public static void main(String[] args) {
        System.out.println("--- PROGRAMA PRINCIPAL ---");
        Local l1 = new Local("Floresta");
        Local l2 = new Local("Konoha");
        Local l3 = new Local("Montanhas");
        Professor p1 = new Professor("Tsunade", "Jutsu de invocação");
        Professor p2 = new Professor("Kakashi", "Ninjutsu");
        Professor p3 = new Professor("Gai", "Taijustu");
        Aluno a1 = new Aluno("Sasuke", 16);
        Aluno a2 = new Aluno("Naruto", 15);
        Aluno a3 = new Aluno("Sakura", 14);
        Aluno a4 = new Aluno("Sai", 17);
        Aluno a5 = new Aluno("Rock Lee", 14);
        Aluno a6 = new Aluno("Shikamaru", 16);
        Aluno a7 = new Aluno("Choji",14);
        Seminario s1 = new Seminario("Invocação", l3);
        Seminario s2 = new Seminario("Taijutsu", l1);
        Seminario s3 = new Seminario("Trabalho em equipe", l2);

        System.out.println("--- FIM INICIALIZAÇÃO ---");

        p1.addSeminarios(s1);

        p2.addSeminarios(s3, s2);

        s1.addAlunos(a3, a4);

        s2.addAlunos(a5, a7);

        s3.addAlunos(a1, a2, a6);

        System.out.println(Seminario.seminariosToString());

        System.out.println(Aluno.alunosToString());

        System.out.println(Professor.professoresToString());

        System.out.println(Local.locaisToString());
    }
}
