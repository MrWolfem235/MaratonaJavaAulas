package br.com.maratonajava.aula.Aprojetos.estoque.exceptions;

public class ProductNotFoundException extends NotFoundException {
    public ProductNotFoundException(String message){
        super (message);
    }
    
    public ProductNotFoundException(){
        super();
    }
}
