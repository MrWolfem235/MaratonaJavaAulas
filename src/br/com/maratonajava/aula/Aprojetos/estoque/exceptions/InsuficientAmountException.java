package br.com.maratonajava.aula.Aprojetos.estoque.exceptions;

public class InsuficientAmountException extends RuntimeException {
    public InsuficientAmountException(){
        super();
    }

    public InsuficientAmountException(String message){
        super(message);
    }
}
