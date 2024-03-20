package br.com.maratonajava.aula.XColections.exercises.domain.impressao;

public class ImpressãoTest {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        impressora.put(new Impressão("Currículo do Barnei", Prioridade.COMUM));
        impressora.put(new Impressão("Contrato de venda", Prioridade.POUCO_IMPORTATE));
        impressora.put(new Impressão("Declaração de renda da firma", Prioridade.IMPORTANTE));
        impressora.put(new Impressão("Apresentação de slides", Prioridade.COMUM));
        impressora.put(new Impressão("Lista de tarefas", Prioridade.POUCO_IMPORTATE));
        impressora.put(new Impressão("Relatório de desempenho", Prioridade.IMPORTANTE));
        impressora.put(new Impressão("Convite para evento", Prioridade.COMUM));
        impressora.put(new Impressão("Instruções de montagem", Prioridade.POUCO_IMPORTATE));
        impressora.put(new Impressão("Orçamento anual", Prioridade.IMPORTANTE));
        impressora.put( new Impressão("Artigo científico", Prioridade.COMUM));
        impressora.put( new Impressão("Guia do usuário", Prioridade.POUCO_IMPORTATE));
        impressora.put( new Impressão("Contrato de parceria", Prioridade.IMPORTANTE));
        impressora.startPrinter();
    }
}
