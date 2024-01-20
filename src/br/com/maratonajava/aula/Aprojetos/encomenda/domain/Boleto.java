package br.com.maratonajava.aula.Aprojetos.encomenda.domain;

public class Boleto {

    private Pedido pedido;

    public Boleto(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "____Boleto____ \n-Cliente: " + pedido.getCliente().getNome()+ "\n-Status: "+ (pedido.isPagamentoConcluído()? "Pagamento efetuado":"Esperando pagamento")+"\n-Info: "+ pedido.listaProdutos()   + "\n\n-SubTotal: " + pedido.getSubTotal() + "\n-Taxa: " + pedido.getTaxa()
                + "\n___________\n-Total: " + pedido.getTotal();
    }

    public void pagarBoleto(){//método para pagar o boleto
        pedido.setPagamentoConcluído(true);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
