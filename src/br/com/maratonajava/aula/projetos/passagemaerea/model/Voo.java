package br.com.maratonajava.aula.projetos.passagemaerea.model;

import br.com.maratonajava.aula.projetos.passagemaerea.assento.TipoAssento;

public class Voo {
    private Aviao aviao;
    private Local local;
        
    public Voo(Aviao aviao, Local local) {
        this.aviao = aviao;
        this.local = local;
    }

    @Override
    public String toString() {
        return "--- Voo --- \n" + aviao + "\n" + local;
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
