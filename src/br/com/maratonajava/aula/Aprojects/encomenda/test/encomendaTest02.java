package br.com.maratonajava.aula.Aprojects.encomenda.test;

import br.com.maratonajava.aula.Aprojects.encomenda.domain.*;

public class encomendaTest02 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Redmi Note 11 Pro 5G", 1354, 2.5, true);
        Produto p2 = new Produto("motorola razr 40", 5499, 0.1, false);
        Produto p3 = new Produto("iPhone 15 Pro Max", 9899,170,false);

        Endereco e1 = new Endereco("Rua das Amélias", "13222-177");
        Endereco e2 = new Endereco("R. do Desmérito", "13338-999");
        Endereco e3 = new Endereco("Av. Imigrantes", "15888-999");

        Cliente c1 = new Cliente("Albert Andrade da Silva", e1, "503.017.258-02");
        Cliente c2 = new Cliente("Andressa Camargo", e3, "888.323.432-67");
        Cliente c3 = new Cliente("Carlos Paulo Eduardo", e2, "223.387.008-56");

        Estoque.setEndereco(e1);

        Estoque.addEstoque(p1, 100);
        Estoque.addEstoque(p2, 200);
        Estoque.addEstoque(p3, 150);

        System.out.println(Estoque.tostring());
        
        Pedido pe1 = new Pedido(c2, p1, p1, p1, p1);

        System.out.println(c1);


        System.out.println(pe1);

        System.out.println(pe1.getBoleto());

        pe1.getBoleto().pagarBoleto();

        System.out.println(pe1.getBoleto());

        System.out.println(Estoque.tostring());

    }
}
