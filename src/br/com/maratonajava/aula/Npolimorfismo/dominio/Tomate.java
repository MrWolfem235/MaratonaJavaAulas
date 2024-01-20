package br.com.maratonajava.aula.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public final double TAXA = 0.06;
    private String dataValidade;

    public Tomate(String nome, double valor, String dataValidade){
        super(nome, valor);
        this.setDataValidade(dataValidade);
    }

    public double calcularImposto(){
        System.out.println("Calculando imposto do tomate...");
        return this.getValor() * TAXA;
    }

    public double getTAXA() {
        return TAXA;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
