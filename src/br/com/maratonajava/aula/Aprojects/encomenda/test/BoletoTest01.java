package br.com.maratonajava.aula.Aprojects.encomenda.test;

import br.com.maratonajava.aula.Aprojects.encomenda.domain.*;

public class BoletoTest01 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Redmi Note 11 Pro 5G", 1354, 2.5, true);
        Produto p2 = new Produto("motorola razr 40", 5499, 0.1, false);
        Produto p3 = new Produto("iPhone 15 Pro Max", 9899,170,false);

        Endereco e1 = new Endereco("Rua das Amélias", "13222-177");

        Cliente c1 = new Cliente("Albert Andrade da Silva", e1, "503.017.258-02");

        Estoque.setEndereco(e1);

        Estoque.addEstoque(p1, 10);
        Estoque.addEstoque(p2, 20);
        Estoque.addEstoque(p3, 15);

        System.out.println(Estoque.tostring());
        System.out.println();

        Pedido pe1 = new Pedido(c1, p1, p1, p2, p3);
        Pedido pe2 = new Pedido(c1, p3, p3);
        
        System.out.println(Estoque.tostring());
    }
}
