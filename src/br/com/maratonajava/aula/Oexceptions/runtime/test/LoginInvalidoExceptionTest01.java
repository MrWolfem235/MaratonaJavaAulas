package br.com.maratonajava.aula.Oexceptions.runtime.test;

import java.util.Scanner;

import br.com.maratonajava.aula.Oexceptions.runtime.domain.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try{
            System.out.println("~Main: Iniciando excecução do Login...");
        login();
        }catch(LoginInvalidoException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("~Main: Finalizando excecução do Login...");
        }
        
    }

    private static boolean login() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
        String userDB = "Vegeta";//dados de usuário e senha setados
        String passwordDB = "inseto";
        System.out.println("User: ");//capturando dados
        String userInput = scanner.nextLine();
        System.out.println("Password: ");
        String passwordInput = scanner.nextLine();

        if(!userInput.equals(userDB) | !passwordInput.equals(passwordDB)){//Validação da conexão
            System.out.println("~Login: Erro na validação do login...");
            throw new LoginInvalidoException("Erro: Login ou senha inválidos!");
        }

        System.out.println("~Login: loguin efetuado com sucesso!");

        return true;
    }
}
