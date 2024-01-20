package br.com.maratonajava.aula.Avarags.funcionario.test;

import br.com.maratonajava.aula.Avarags.funcionario.domain.Atendente;
import br.com.maratonajava.aula.Avarags.funcionario.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        try {

            Atendente func = new Atendente("João Almeida Silva", 18, 1499);
            Gerente ger = new Gerente("José Honret", 46, 3589.90f, 4500.60f);
            System.out.println(func.info() + "\n" + func.wagesMedia());
            System.out.println();
            System.out.println(ger.info() + "\n" + ger.wagesMedia());
            System.out.println();

        } catch (IllegalArgumentException e) {

            System.out.println("Erro na execução da aplicação:");
            System.out.println(e.getMessage());
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Erro desconhecido pelo programa atual: ");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
