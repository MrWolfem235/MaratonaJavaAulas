package br.com.maratonajava.aula.projetos.encomenda.domain;

import java.util.ArrayList;

public class Cliente extends Pessoa{

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente(String nome, Endereco e1, String cpf) {
        super(nome, e1, cpf);
    }

    {
        clientes.add(this);
    }

    @Override
    public String toString() {
        return "=== Cliente === \n"+super.toString();
    } 
}
