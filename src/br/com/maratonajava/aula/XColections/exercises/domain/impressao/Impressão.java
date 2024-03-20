package br.com.maratonajava.aula.XColections.exercises.domain.impressao;

public class Impressão implements Comparable<Impressão> {
    private String detalhe;
    private Prioridade prioridade;

    public Impressão(String detalhe, Prioridade prioridade) {
        this.detalhe = detalhe;
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(Impressão impressão) {
        return Integer.compare(prioridade.getNivelDePrioridade(),impressão.prioridade.getNivelDePrioridade());
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
}
