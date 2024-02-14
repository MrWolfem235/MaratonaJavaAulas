package br.com.maratonajava.aula.Aprojects.encomenda.test;

import br.com.maratonajava.aula.Aprojects.encomenda.domain.*;

public class EstoqueTest01 {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua das Amélias", "13222-177");
        Endereco e2 = new Endereco("R. do Desmérito", "13338-999");
        
        Produto p1 = new Produto("Redmi Note 11 Pro 5G", 1354, 2.5, true);
        Produto p2 = new Produto("motorola razr 40", 5499, 0.1, false);
        Produto p3 = new Produto("iPhone 15 Pro Max", 9899,170,false);

        Estoque est1 = new Estoque (e1);
        Estoque est2 = new Estoque (e2);

        est1.addEstoque(p1, 150);
        est1.addEstoque(p2, 300);
        est1.addEstoque(p3, 200);

        System.out.println(est1.toString());

        System.out.println();

        System.out.println(est2.toString());

        System.out.println();

        est1.moverEstoque(p2, 75, est2);

        est1.moverEstoque(p1, 50, est2);

        System.out.println(est1.toString());

        System.out.println();

        System.out.println(est2.toString());

    }
}
