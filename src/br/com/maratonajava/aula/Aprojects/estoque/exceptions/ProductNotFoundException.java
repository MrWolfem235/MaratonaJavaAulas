package br.com.maratonajava.aula.Aprojects.estoque.exceptions;

public class ProductNotFoundException extends NotFoundException {
    public ProductNotFoundException(String message){
        super (message);
    }
    
    public ProductNotFoundException(){
        super();
    }
}
