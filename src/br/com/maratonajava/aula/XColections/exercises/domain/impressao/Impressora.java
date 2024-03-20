package br.com.maratonajava.aula.XColections.exercises.domain.impressao;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Impressora {
    Queue<Impressão> impressões = new PriorityQueue<>();

    public void put(Impressão impressão){
        impressões.add(impressão);
    }

    public void startPrinter(){
        Impressão impressão;
        while (!impressões.isEmpty()){
            impressão = impressões.poll();
            System.out.println("\n================      IMPRIMINDO DOCUMENTO      ================");
            System.out.println(String.format("-----------      %30s      -----------",impressão.getDetalhe()));
            System.out.println(String.format("-----------      %30s      -----------",impressão.getPrioridade()));
            System.out.println("----------------------------------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<Impressão> getPendentPrints(){
        return impressões.stream().toList();
    }
}
