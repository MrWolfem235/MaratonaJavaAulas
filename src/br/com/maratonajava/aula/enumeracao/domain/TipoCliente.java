package br.com.maratonajava.aula.enumeracao.domain;

public enum TipoCliente {//Classe especial Enumeração
    PESSOA_FISICA(1, "Pessoa Física"),//Membros estáticos e finais da classe
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    
    private final int VALOR;//declaração de variável para identificar os membros
    private final String nomeRelatorio;

    private TipoCliente(int valor, String nomeRelatorio){//sobreposição do construtuor com entrada da variável valor
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor(){//retornar valor do membro
        return VALOR;
    }

    public String getNomeRelatorio(){
        return nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio (String nomeRelatorio){
        for (TipoCliente tipoCliente : values()){
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }
}
