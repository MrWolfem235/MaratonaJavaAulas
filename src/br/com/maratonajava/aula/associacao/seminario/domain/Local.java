package br.com.maratonajava.aula.associacao.seminario.domain;

import java.util.ArrayList;

public class Local {
    private String endereco;
    private static ArrayList <Local> locais = new ArrayList();

    public Local(String endereco) {
        this.endereco = endereco;
        System.out.println("Novo local cadastrado!!!");
        System.out.println(toString());
        locais.add(this);
    }

    @Override
    public String toString() {
        return "--- Local ---\n" +
                "Endereco:" + endereco+"\n";
    }

    public static String locaisToString(){
        String info = "";
        for (Local local: locais){
            info += local.toString()+"\n";
        }
        return info;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static ArrayList getLocais() {
        return locais;
    }

    public static void setLocais(ArrayList locais) {
        Local.locais = locais;
    }
}
