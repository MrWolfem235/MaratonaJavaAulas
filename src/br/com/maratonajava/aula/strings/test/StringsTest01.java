package br.com.maratonajava.aula.strings.test;

public class StringsTest01 {
    public static void main(String[] args) {
        
        //variável de referência aponta para o mesmo endereço de string guardada na pool
        String nome01 = "Carlos";
        String nome02 = "Carlos";
        //o construtor cria um nova referência e outra string, diferente das strings na pool
        String nome03 = new String("Carlos");
        String nome04 = new String("Carlos");

        System.out.println(nome03 == nome04);// false (não estão na pool)

        System.out.println(nome01 == nome02);// true (tem a referência igual)

        System.out.println(nome03.equals(nome04));// true (.equals compara o conteúdo e não a referência)
    }
}
