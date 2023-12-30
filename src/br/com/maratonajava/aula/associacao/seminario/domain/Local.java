package br.com.maratonajava.aula.associacao.seminario.domain;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
        System.out.println("Novo local cadastrado!!!");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "--- Local ---\n" +
                "Endereco:" + endereco+"\n";
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
