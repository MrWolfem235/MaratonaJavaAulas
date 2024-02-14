package br.com.maratonajava.aula.Aprojects.passagemaerea.services;


import br.com.maratonajava.aula.Aprojects.passagemaerea.model.Assento;
import br.com.maratonajava.aula.Aprojects.passagemaerea.model.Pessoa;
import br.com.maratonajava.aula.Aprojects.passagemaerea.model.Voo;

public class Reserva {

    public static String reservar(Voo voo,String codigo, Pessoa pessoa){//método para reservar um assento
        Assento assentos[][] = voo.getAviao().getAssentoOrganizado(); //puxa o array de voo para uma variavel local, mais simples
        if (pessoa.getVooCadastrado() != null){throw new IllegalAccessError("ERRO: Não é possível reservar dois voos para uma mesma pessoa!");}
        for (int i = 0; i < assentos.length; i++) {//itera sobre todos os assentos do array
            for (int j = 0; j < assentos[i].length && assentos[i][j] != null; j++) {
                if (assentos[i][j].getCódigo().equals(codigo)){//se o código do assento bater com o passado no parâmetro
                    if  (assentos[i][j].getPessoa() != null){throw new IllegalAccessError("ERRO: Não é possível sobrescrever um assento já ocupado!");}//exceção para caso o assento já esteja ocupado
                    assentos[i][j].setPessoa(pessoa);//setando a pessoa no referido assento
                    pessoa.setVooCadastrado(voo);//setando respectivo voo na pessoa
                    return "Assento "+codigo+" reservado por "+assentos[i][j].getPessoa().getNome()+" com sucesso!!!";
                }
            }            
        }
        return null;
    }

    public static String cancelar(Pessoa pessoa){
        Assento assentos[][] = pessoa.getVooCadastrado().getAviao().getAssentoOrganizado();//puxa o array de voo para uma variavel local, mais simples
        for (int i = 0; i < assentos.length; i++) {//itera sobre todos os assentos do array
            for (int j = 0; j < assentos[i].length && assentos[i][j] != null; j++) {
                if (assentos[i][j].getPessoa() == pessoa){//se o código do assento bater com o passado no parâmetro
                    if (assentos[i][j] == null){throw new IllegalAccessError("ERRO: Não é possível cancelar um cadastro inexistente!");}
                    assentos[i][j].setPessoa(null);//setando a pessoa no referido assento
                    pessoa.setVooCadastrado(null);//setando respectivo voo na pessoa
                    return "Reserva do assento "+assentos[i][j].getCódigo()+" cancelada por "+assentos[i][j].getPessoa().getNome()+" com sucesso!!!";
                }
            }            
        }
        return null;
    }
}
