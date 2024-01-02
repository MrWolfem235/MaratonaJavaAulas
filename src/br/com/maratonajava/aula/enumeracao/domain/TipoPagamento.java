package br.com.maratonajava.aula.enumeracao.domain;

    public enum TipoPagamento{//Enumeração criada dentro da classe Cliente
        DEBITO("Débito"){
            @Override
            public double calcDesconto(double valor){
                return valor * 0.1;
            }
        },
        CREDITO("Crédito"){
            @Override
            public double calcDesconto(double valor){
                return valor * 0.05;
            }
        };

        private String nomeRelatorio;

        private TipoPagamento(String nomeRelatorio){
            this.nomeRelatorio = nomeRelatorio;
        }

        public String getNomeRelatorio(){
            return nomeRelatorio;
        }

        public abstract double calcDesconto(double valor);
    }
