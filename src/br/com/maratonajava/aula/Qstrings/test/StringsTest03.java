package br.com.maratonajava.aula.Qstrings.test;

public class StringsTest03 {
    public static void main(String[] args) {
        
        long inicio = System.currentTimeMillis();
        // concatString(100_000);
        concatStringBuffer(1_000_000);
        long fim = System.currentTimeMillis();
        System.out.println("O tempo de excecução foi de "+ (fim - inicio)+ "ms");
        System.out.println(System.currentTimeMillis());
    }

    public static void concatString(int tamanho){//concatenação de string padrão
        String string = "";
        for (int i = 0; i < tamanho; i++) {
            string += i;
        }
    }

    public static void concatStringBuilder(int tamanho){//concatenação muito mais rápida
        StringBuilder string = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            string.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho){//concatenação feita para multi-thread pela sincronização
        StringBuffer string = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            string.append(i);
        }
    }
}

