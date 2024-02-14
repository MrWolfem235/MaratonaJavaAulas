package br.com.maratonajava.aula.Aprojects.estoque.exceptions;

public class InsuficientAmountException extends RuntimeException {
    public InsuficientAmountException(){
        super();
    }

    public InsuficientAmountException(String message){
        super(message);
    }
}
