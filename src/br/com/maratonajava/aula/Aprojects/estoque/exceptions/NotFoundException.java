package br.com.maratonajava.aula.Aprojects.estoque.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message){
        super(message);
    }

    public NotFoundException(){
        super();
    }
}
