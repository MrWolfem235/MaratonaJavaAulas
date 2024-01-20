package br.com.maratonajava.aula.Oexceptions.runtime.domain;

public class LoginInvalidoException extends Exception {
    
    public LoginInvalidoException(String customMessage){//construtor para mensagem de erro personalizada
        super(customMessage);
    }

    public LoginInvalidoException(){//construtor para mensagem vazia
        super("Falha no login");
    }

}

/*
 * Java permite a criação de exceções personalizadas, para ser checked ou uncheked,
 * No exemplo é criado uma exceção para caso de falha no loguin
 */
