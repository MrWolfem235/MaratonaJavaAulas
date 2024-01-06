package br.com.maratonajava.aula.projetos.passagemaerea.model;

import java.util.ArrayList;

import br.com.maratonajava.aula.projetos.passagemaerea.assento.TipoAssento;

public class Aviao {
    private String nome;
    private ArrayList<Assento> assentos = new ArrayList<Assento>();
    private Assento assentoOrganizado[][];

    public Aviao(String nome) {
        this.nome = nome;
    }
    

    @Override
    public String toString() {
        return "--- Aviao ---\n -nome: " + nome + "\n-qtdAssentos: "+this.assentos.size()+"\n -Assentos: \n" + assentoToString();
    }

    private String assentoToString(){
        String retorno = "";
        int k = 0;
        for (int i = 0; i < assentoOrganizado[i].length; i++) {
            for (int j = 0; j < assentoOrganizado[i].length; j++) {
                retorno += String.format("[%s]", (assentoOrganizado[i][j].isOcupado()? "o":" "));
                k++;
            }
        System.out.println();
        }
        return retorno;
    }

    // private String showAssentos(){//criar exceção se não for mútliplo de 5, para facilitar desenho gráfico
    //     int qtdAssentos = this.assentos.size();
    //     int largura;
    //     int comprimento;

    //     for (int i = 3; ; i++) {//encontrar largura ideal
    //         if(qtdAssentos % i == 0){largura = (qtdAssentos / i); break;}
    //     }

    //     comprimento = qtdAssentos / largura;

    //     String retorno = "";
    //     int k = 0;//iterador para puxar o índice do array assentos
    //     for (int i = 5; i < largura; i++) {//de linha em linha
    //         for (int j = 0; j < comprimento; j++) {//de coluna em coluna
    //             retorno += String.format("[%s]", (this.assentos.get(k).isOcupado()? "o":" "));
    //             k++;
    //         }
    //         retorno += "\n";//pula para próxima linha
    //     }
    //     return retorno;
    // }
    private Assento[][] arrayListToAssentoOrganizado(){//transforma o array list em um array bidimensional com a ordem dos bancos
        
        //criar exceção se não for mútliplo de 5, para facilitar desenho gráfico
        int qtdAssentos = this.assentos.size();
        int largura;
        int comprimento;
        Assento[][] assentosEmOrdem;

        for (int i = 3; ; i++) {//encontrar largura ideal
            if(qtdAssentos % i == 0){largura = (qtdAssentos / i); break;}
        }

        comprimento = qtdAssentos / largura;

        assentosEmOrdem = new Assento[largura][comprimento];

        int k = 0;
        for (int i = 0; i < comprimento; i++) {
            for (int j = 0; j < largura; j++) {
                assentosEmOrdem[j][i] = this.assentos.get(k);
                k++;
            }
        }

        // String retorno = "";
        // int k = 0;//iterador para puxar o índice do array assentos
        // for (int i = 5; i < largura; i++) {//de linha em linha
        //     for (int j = 0; j < comprimento; j++) {//de coluna em coluna
        //         retorno += String.format("[%s]", (this.assentos.get(k).isOcupado()? "o":" "));
        //         k++;
        //     }
        //     retorno += "\n";//pula para próxima linha
        // }
        return assentosEmOrdem;
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


    public void addAssentos(int assentos, TipoAssento tipoAssento) {//entra qtd e tipo de assento, e cadastra na lista de assentos do aviao
        for (int i = 0; i < assentos; i++) {
            this.assentos.add(new Assento(tipoAssento));
        }
        arrayListToAssentoOrganizado();
    }
    
}
