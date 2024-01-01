package br.com.maratonajava.aula.projetos.encomenda.domain;

import java.util.ArrayList;

public class Produto {

    public static ArrayList<Produto> produtos = new ArrayList<Produto>();
    private InfoProduto infoProduto;
    private String nome;

    public Produto(String nome, double valor,double peso, boolean fragil, String descricao) {
        infoProduto = new InfoProduto(nome, valor, peso, fragil);
        this.setNome(nome);
    }

    public Produto(String nome, double valor, double peso, boolean fragil) {
        infoProduto = new InfoProduto(nome, valor, peso, fragil);
        this.setNome(nome);
    }

    {
        produtos.add(this);
    }

    @Override
    public String toString() {
        return "--- Produto --- \n  "+nome+"\n"+ (infoProduto.getNome() != null? infoProduto:"");
    }

    public InfoProduto getInfoProduto() {
        return infoProduto;
    }

    public void setInfoProduto(InfoProduto infoProduto) {
        this.infoProduto = infoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        infoProduto.setNome(nome);
    }
}
