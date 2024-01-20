package br.com.maratonajava.aula.Menumeracao.domain;

public class Cliente {

    public enum TipoPagamento{//Enumeração criada dentro da classe Cliente
        DEBITO("Débito"), CREDITO("Crédito");

        private String nomeRelatorio;

        private TipoPagamento(String nomeRelatorio){
            this.nomeRelatorio = nomeRelatorio;
        }

        public String getNomeRelatorio(){
            return nomeRelatorio;
        }
    }

    private String nome;//Declaração de atributos
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {//Construtor com entrada de dados aceitando membros de enumerações
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {//toString para printar no terminal os dados da instância
        return "--- Cliente --- \n-nome: " + nome + "\n-tipoCliente: " +tipoCliente.getNomeRelatorio() + "\n-tipoClienteInt: " + tipoCliente.getValor() + "\n-tipoPagamento: "
                + tipoPagamento.getNomeRelatorio();
    }
}
