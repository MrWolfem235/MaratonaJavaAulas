package br.com.maratonajava.aula.associacao.seminario.test;

import br.com.maratonajava.aula.associacao.seminario.domain.*;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local l1 = new Local("R. 25 de Março");
        Professor p1 = new Professor("Tsunade", "Hokage");
        Aluno a1 = new Aluno("Sasuke", 16);
        Aluno a2 = new Aluno("Naruto", 15);
        Aluno a3 = new Aluno("Sakura", 14);
        Seminario s1 = new Seminario("Economia", l1);


    }
}
