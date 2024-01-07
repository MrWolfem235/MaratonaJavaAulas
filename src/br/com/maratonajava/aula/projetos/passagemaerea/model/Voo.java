package br.com.maratonajava.aula.projetos.passagemaerea.model;

public class Voo {
    private Aviao aviao;
    private Local local;
        
    public Voo(Aviao aviao, Local local) {
        this.aviao = aviao;
        this.local = local;
    }

    @Override
    public String toString() {
        return "--- Voo --- \n" + "\n-Destino: " + local +"\n\n"+ aviao;
    }

    public String basicInfo() {
        return "--- Voo --- \n" + "-Destino: " + local +"\n-Avião: "+ aviao.getNome();       
    } 

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    
}
