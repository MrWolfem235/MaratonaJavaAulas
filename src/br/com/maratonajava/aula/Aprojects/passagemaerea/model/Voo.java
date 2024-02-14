package br.com.maratonajava.aula.Aprojects.passagemaerea.model;

public class Voo {
    private Aviao aviao;
    private Local local;
        
    public Voo(Aviao aviao, Local local) {
        this.aviao = aviao;
        this.local = local;
    }

    @Override
    public String toString() {
        String infoPassageiros = "";
        for (Pessoa pessoa : aviao.getPassageiros()){
            infoPassageiros += pessoa.getNome() + "\n";
        }

        return "--- Voo --- \n"+ "-Passageiros: \n" + infoPassageiros + "\n-Destino: " + local +"\n\n"+ aviao;
    }

    public String basicInfo() {
        return "--- Voo --- \n" + "-Destino: "+  local +"\n-Avião: "+ aviao.getNome();       
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
