package br.com.maratonajava.aula.projetos.estoque.test;

import br.com.maratonajava.aula.projetos.estoque.domain.Product;
import br.com.maratonajava.aula.projetos.estoque.domain.Stock;
import br.com.maratonajava.aula.projetos.estoque.types.*;

public class EstoqueTest01 {
    public static void main(String[] args) {
        Stock stock1 = new Stock();
        Product product1 = new Product("iPhone 15", 5_420f, "Celular Aple", Size.NON_APLICABLE, Color.DARK_GRAY, Brand.IPHONE, Category.ELECTRONICS);
        System.out.println(product1.toString());
    }
}
