package br.com.maratonajava.aula.projetos.passagemaerea.model;

import br.com.maratonajava.aula.projetos.passagemaerea.assento.*;

public class Assento {
    private boolean ocupado;
    private TipoAssento tipoAssento;

    {
        ocupado = false;
    }

    public Assento(TipoAssento tipoAssento) {
        this.tipoAssento = tipoAssento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public TipoAssento getTipoAssento() {
        return tipoAssento;
    }

    public void setTipoAssento(TipoAssento tipoAssento) {
        this.tipoAssento = tipoAssento;
    }
}
