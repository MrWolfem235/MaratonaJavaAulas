package br.com.maratonajava.aula.Aprojetos.estoque.exceptions;

public class StockNotFoundException extends NotFoundException {
    public StockNotFoundException(String message){
        super(message);
    }

    public StockNotFoundException(){
        super();
    }

}
