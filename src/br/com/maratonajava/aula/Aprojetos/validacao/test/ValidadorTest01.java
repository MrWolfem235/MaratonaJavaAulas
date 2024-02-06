package br.com.maratonajava.aula.Aprojetos.validacao.test;

import br.com.maratonajava.aula.Aprojetos.validacao.domain.Out;
import br.com.maratonajava.aula.Aprojetos.validacao.domain.Pessoa;
import br.com.maratonajava.aula.Aprojetos.validacao.services.Validador;

import java.util.Scanner;

public class ValidadorTest01 {
    public static void main(String[] args) {
        Validador validador = new Validador();

        String userInput;

        Scanner scanner = new Scanner(System.in);

        String tempName;
        String tempPhone;
        String tempEmail;
        String tempCpf;

        do {
            Out.limparTela();

            System.out.print("Digite seu nome: ");

            userInput = scanner.nextLine();

            System.out.println((validador.hasName(userInput) ? "":"Nome inválido tente novamente!"));

            Out.sleep(500);

        }while(!validador.hasName(userInput));

        tempName = userInput;

        do {
            Out.limparTela();

            System.out.print("Digite seu telefone: ");

            userInput = scanner.nextLine();

            System.out.println((validador.hasPhoneNumber(userInput) ? "":"Telefone inválido tente novamente!"));

            Out.sleep(500);

        }while(!validador.hasPhoneNumber(userInput));

        tempPhone = userInput;

        do {
            Out.limparTela();

            System.out.print("Digite seu CPF: ");

            userInput = scanner.nextLine();

            System.out.println((validador.hasCpf(userInput) ? "":"CPF inválido tente novamente!"));

            Out.sleep(500);

        }while(!validador.hasCpf(userInput));

        tempCpf = userInput;


        do {
            Out.limparTela();

            System.out.print("Digite seu e-mail: ");

            userInput = scanner.nextLine();

            System.out.println((validador.hasEmail(userInput) ? "":"E-mail inválido tente novamente!"));

            Out.sleep(500);

        }while(!validador.hasEmail(userInput));

        tempEmail = userInput;

        Pessoa pessoa = new Pessoa(tempName, tempCpf, tempPhone, tempEmail);

        System.out.println(pessoa.toString());


    }
}
