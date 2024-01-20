package br.com.maratonajava.aula.Menumeracao.test;

import br.com.maratonajava.aula.Menumeracao.domain.*;

public class ClienteTest01 {
    public static void main(String[] args) {
        //Criando clientes
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Yakuza", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        
        System.out.println(TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física"));
        System.out.println(TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica"));
        System.out.println(TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica222"));
    }
}
