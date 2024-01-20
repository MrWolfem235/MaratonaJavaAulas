package br.com.maratonajava.aula.Aprojetos.passagemaerea.model;

import br.com.maratonajava.aula.Aprojetos.passagemaerea.assento.*;

public class Assento {
    private boolean ocupado;
    private Pessoa pessoa;
    private TipoAssento tipoAssento;
    private String código;

    {
        ocupado = false;
    }

    public Assento(TipoAssento tipoAssento) {
        this.tipoAssento = tipoAssento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public TipoAssento getTipoAssento() {
        return tipoAssento;
    }

    public void setTipoAssento(TipoAssento tipoAssento) {
        this.tipoAssento = tipoAssento;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {//setando uma pessoa, automaticamente é setado como ocupado, se for passado null como pessoa, estará desocupado
        this.pessoa = pessoa;
        if (pessoa == null){
            ocupado = false;
        }else{
            ocupado = true;
        }
    }

    
    
}
