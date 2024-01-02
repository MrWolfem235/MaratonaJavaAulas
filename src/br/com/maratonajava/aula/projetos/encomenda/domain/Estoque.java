package br.com.maratonajava.aula.projetos.encomenda.domain;

import java.util.ArrayList;

public class Estoque {
    
    public static ArrayList <Produto> estoque = new ArrayList<Produto>();
    public static ArrayList <Integer> qtd = new ArrayList<Integer>();
    public static Endereco endereco;

    public Estoque (Endereco endereco){
        setEndereco(endereco);
    }

    
    public static String tostring() {
        String estoqueInfo = "\n";
        for (int i = 0; i < estoque.size(); i++){
            estoqueInfo += String.format("- %s \n   Qtd.: %d\n", estoque.get(i).getNome(), qtd.get(i));
        }
        return "--- Estoque --- " + estoqueInfo +'\n'+ endereco;
    }



    public static ArrayList<Produto> getEstoque() {
        return estoque;
    }

    public static void addEstoque(Produto produto, int qtdx) {
        if(estoque.indexOf(produto) == -1){
            estoque.add(produto);
            qtd.add(0);//inicializar área de index equivalente ao do produto
        }
        int index = estoque.indexOf(produto);
        qtd.set(index, qtd.get(index) + qtdx);
    }

    public static void removeEstoque(Produto produto, int qtd){
        addEstoque(produto, -qtd);
    }

    public static void moverEstoque(Produto produtox, int qtdx, Estoque estoquex){
        addEstoque(produtox, qtdx);
        removeEstoque(produtox, qtdx);
    }

    public static int getQtd(Produto produto){
        return qtd.get(estoque.indexOf(produto));
    }

    public static Endereco getEndereco() {
        return endereco;
    }

    public static void setEndereco(Endereco enderecox) {
        endereco = enderecox;
    }

    

}
