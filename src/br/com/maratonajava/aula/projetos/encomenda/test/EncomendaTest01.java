package br.com.maratonajava.aula.projetos.encomenda.test;

import java.util.List;

import br.com.maratonajava.aula.projetos.encomenda.domain.*;

public class EncomendaTest01 {
    public static void main(String[] args) {
        Produto p1 = new Produto("A14 Samsung", 1099, 2.5, true);
        Produto p2 = new Produto("Abajur caseiro - vermenlho", 257, 0.1, false);
        Produto p3 = new Produto("Armário de madeira", 2750,170,false);

        Endereco e1 = new Endereco("Rua das Amélias", "13222-177");
        Endereco e2 = new Endereco("R. do Desmérito", "13338-999");

        Cliente c1 = new Cliente("Albert Andrade da Silva", e1, "503.017.258-02");
        Cliente c2 = new Cliente("Carlos Paulo Eduardo", e2, "223.387.008.56");

        Pedido pe1 = new Pedido(c1, p1, p2);
        Pedido pe2= new Pedido(c2, p2, p2, p3);
    }
}
