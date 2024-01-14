package br.com.maratonajava.aula.strings.test;

public class StringsTest04 {
    public static void main(String[] args) {
        
        String nome = "Carlos Eduardo";
        nome += " de Souza";
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("     josa algh bshsfghb nsrbhgt da Soares     ".trim());
        sb.delete(0,sb.lastIndexOf(" "));
        System.out.println(sb.toString().trim());
    }
}
