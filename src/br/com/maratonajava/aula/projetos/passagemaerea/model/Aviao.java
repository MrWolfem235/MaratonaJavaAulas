package br.com.maratonajava.aula.projetos.passagemaerea.model;

import java.util.ArrayList;

import br.com.maratonajava.aula.projetos.passagemaerea.assento.TipoAssento;

public class Aviao {
    private int largura;//largura pré definida dos assentos, e dps o comprimento é setado
    private String nome;
    private ArrayList<Assento> assentos = new ArrayList<Assento>();
    private Assento assentoOrganizado[][];

    public Aviao(String nome, int largura) {
        if (largura <= 0){throw new IllegalArgumentException("ERRO: Entrada de largura negativa ou zero impossível!");}//lança exceção se largura for negariva
        this.nome = nome;
        this.largura = largura;
    }
    

    @Override
    public String toString() {
        return "--- Aviao ---\n-Nome: " + nome + "\n-Assentos: "+this.assentos.size()+"\n\n" + assentoToString();
    }

    private String assentoToString(){//transforma o array em string gráfico mostrando os assentos
        String retorno = "";
        int comprimento = assentoOrganizado.length;
        int totAssentos = assentos.size();
        int k = 0;//contador externo do numero de assentos
        for (int i = 0; i < comprimento || k < totAssentos; i++) {//cada linha
            for (int j = 0; j < largura && k < totAssentos; j++) {//cada coluna
                String codigo = assentoOrganizado[i][j].getCódigo();
                retorno += String.format("[%s] ", (assentoOrganizado[i][j].isOcupado()? "--":codigo));
                k++;
            }
        retorno += "\n";
        }
        return retorno;
    }

    private Assento[][] arrayListToAssentoOrganizado(){//transforma o array list em um array bidimensional com a ordem dos bancos
        
        //!!!criar exceção se não for mútliplo de 5, para facilitar desenho gráfico
        int qtdAssentos = this.assentos.size();
        int comprimento;
        Assento[][] assentosEmOrdem;
        int totAssentos = assentos.size();


        comprimento = (qtdAssentos / largura)+1;//define comprimento

        assentosEmOrdem = new Assento[comprimento][largura];//inicialização do array dos assentos

        int k = 0;
        for (int i = 0; i < comprimento || k < totAssentos; i++) {//preencher cada índice do array com o respectivo elemento do ArrayList
            for (int j = 0; j < largura && k < totAssentos; j++) {
                assentosEmOrdem[i][j] = this.assentos.get(k);
                assentosEmOrdem[i][j].setCódigo(Auxiliar.alfabeto[i] + (j+1));
                k++;
            }
        }
        return assentosEmOrdem;
    }



    public void addAssentos(int assentos, TipoAssento tipoAssento) {//entra qtd e tipo de assento, adiciona no ArrayList e usa o método que atualiza o arraylist para o array bidimensional
        if (assentos < 0){
            throw new IllegalArgumentException("ERRO: Entrada da quantidade de assentos negativa ou zero impossível!");
        }
        for (int i = 0; i < assentos; i++) {
            this.assentos.add(new Assento(tipoAssento));
        }
        this.assentoOrganizado = arrayListToAssentoOrganizado();
    }


    public int getLargura() {
        return largura;
    }


    public void setLargura(int largura) {
        this.largura = largura;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public ArrayList<Assento> getAssentos() {
        return assentos;
    }

    public Assento[][] getAssentoOrganizado() {
        return assentoOrganizado;
    }


    public void setAssentoOrganizado(Assento[][] assentoOrganizado) {
        this.assentoOrganizado = assentoOrganizado;
    }


    
}
