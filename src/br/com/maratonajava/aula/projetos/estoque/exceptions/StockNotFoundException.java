package br.com.maratonajava.aula.projetos.estoque.exceptions;

public class StockNotFoundException extends NotFoundException {
    public StockNotFoundException(String message){
        super(message);
    }

    public StockNotFoundException(){
        super();
    }

}
