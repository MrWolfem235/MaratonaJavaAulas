package br.com.maratonajava.aula.projetos.encomenda.domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    private Cliente cliente;
    private ArrayList <Produto> produtos = new ArrayList<>();
    private double subTotal = 0;
    private double taxa=0;
    private double total;
    private double pesoTotal=0;

    public Pedido(Cliente cliente, Produto... produtos) {
        this.cliente = cliente;
        this.produtos.addAll(List.of(produtos));

        for(Produto produto: this.produtos){
            this.subTotal += produto.getInfoProduto().getValor();
            this.pesoTotal += produto.getInfoProduto().getPeso();
        }
        this.taxa = calcTaxa(pesoTotal);
        this.total = subTotal + taxa;
    }

    {
        pedidos.add(this);
    }

    @Override
    public String toString() {
        String produtosInfo = "";
        for (Produto produto: produtos){
            produtosInfo += "\n -"+produto.getNome();
        }
        return "=== Pedido === \n-Cliente: " + cliente.getNome()+ "\n-SubTotal: " + this.subTotal
                + "\n-Taxa: " + this.taxa + "\n-Total: " + this.total + "\n-Peso Total: " + this.pesoTotal+"\n-Produtos: " + produtosInfo;
    }



    private double calcTaxa(double peso){
        return 5 + peso*0.1;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    
}
