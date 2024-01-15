package br.com.maratonajava.aula.projetos.estoque.exceptions;

public class ProductNotFoundException extends NotFoundException {
    public ProductNotFoundException(String message){
        super (message);
    }
    
    public ProductNotFoundException(){
        super();
    }
}
