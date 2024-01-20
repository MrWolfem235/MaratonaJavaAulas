package br.com.maratonajava.aula.Aprojetos.encomenda.test;

import java.util.List;

import br.com.maratonajava.aula.Aprojetos.encomenda.domain.*;

public class EncomendaTest01 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Redmi Note 11 Pro 5G", 1354, 2.5, true);
        Produto p2 = new Produto("motorola razr 40", 5499, 0.1, false);
        Produto p3 = new Produto("iPhone 15 Pro Max", 9899,170,false);

        Endereco e1 = new Endereco("Rua das Amélias", "13222-177");
        Endereco e2 = new Endereco("R. do Desmérito", "13338-999");
        Endereco e3 = new Endereco("Av. Imigrantes", "15888-999");

        Cliente c1 = new Cliente("Albert Andrade da Silva", e1, "503.017.258-02");
        Cliente c2 = new Cliente("Carlos Paulo Eduardo", e2, "223.387.008.56");

        Pedido pe1 = new Pedido(c1, p1, p2);
        Pedido pe2= new Pedido(c2, p2, p2, p3);

        Estoque est1 = new Estoque(e3);

        System.out.println(est1.toString());
    }
}
