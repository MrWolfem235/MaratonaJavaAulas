package br.com.maratonajava.aula.XColections.exercises.domain.impressao;

public enum Prioridade {
    COMUM(2),
    POUCO_IMPORTATE(1),
    IMPORTANTE(0);

    private int nivelDePrioridade;

    Prioridade(int nivelDePrioridade) {
        this.nivelDePrioridade = nivelDePrioridade;
    }

    public int getNivelDePrioridade() {
        return nivelDePrioridade;
    }
}
