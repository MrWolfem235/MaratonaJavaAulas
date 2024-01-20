package br.com.maratonajava.aula.Aprojetos.encomenda.domain;

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
    private boolean pagamentoConcluído;
    private Boleto boleto;

    public Pedido (Cliente cliente, Produto... produtos) {
        this.cliente = cliente;
        this.produtos.addAll(List.of(produtos));

        for(Produto produto: this.produtos){//calculo de taxa, subtotal e total.
            this.subTotal += produto.getInfoProduto().getValor();
            this.pesoTotal += produto.getInfoProduto().getPeso();
            Estoque.removeEstoque(produto, 1);
        }
        this.taxa = calcTaxa(pesoTotal);
        this.total = subTotal + taxa;
    }

    {
        this.boleto = new Boleto(this); //criação de boleto
        pedidos.add(this); //adicionar pedido a lista geral de pedidos
    }

    @Override
    public String toString() {
        String produtosInfo = listaProdutos();
        return "=== Pedido === \n-Cliente: " + cliente.getNome()+"\n-Status: "+ (isPagamentoConcluído()? "Pagamento efetuado":"Esperando pagamento")+ "\n-SubTotal: " + this.subTotal
                + "\n-Taxa: " + this.taxa + "\n-Total: " + this.total + "\n-Peso Total: " + this.pesoTotal+"\n-Produtos: " + produtosInfo;
    }

    public String listaProdutos(){//retorna string com lista de produtos
        String produtosInfo = "";
        for (Produto produto: produtos){
            produtosInfo += "\n -"+produto.getNome();
        }
        return produtosInfo;
    }

    private double calcTaxa(double peso){
        return 5 + peso*0.1;
    }

    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public static void setPedidos(ArrayList<Pedido> pedidos) {
        Pedido.pedidos = pedidos;
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

    public boolean isPagamentoConcluído() {
        return pagamentoConcluído;
    }

    public void setPagamentoConcluído(boolean pagamentoConcluído) {
        this.pagamentoConcluído = pagamentoConcluído;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    
}
