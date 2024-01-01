package br.com.maratonajava.aula.projetos.encomenda.domain;

public class InfoProduto {
    private String nome;
    private double valor;
    private double peso;
    private boolean fragil;
    private String descricao;

    public InfoProduto(String nome, double valor, double peso, boolean fragil, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.peso = peso;
        this.fragil = fragil;
        this.descricao = descricao;
    }

    public InfoProduto(String nome, double valor, double peso, boolean fragil) {
        this.nome = nome;
        this.valor = valor;
        this.peso = peso;
        this.fragil = fragil;
    }

    @Override
    public String toString() {
        return "--- InfoProduto --- \n-Nome: " + nome + "\n-Valor: " + valor + "\n-Peso: " + peso + "\n-Fragil: "
                + fragil + "\n-Descricao: " + descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
