package br.com.maratonajava.aula.Oexceptions.runtime.test;

public class RuntimeException01 {
    public static void main(String[] args) {
        try{
            System.out.println("Main: Preparando para chamar método");
            abrirConexao();
        }catch(Exception e){
            System.out.println("Main: Erro no método");
        }finally{
            System.out.println("Main: Chamada do método finalizada");
        }
    }

    private static String abrirConexao(){
        try{
            System.out.println("Método: Iniciando abertura de conexão...");
            System.out.println("Método: Escrevendo sobre o arquivo...");
            return "Método: Escrita completa";
        }catch(Exception e ){
            System.out.println("Método: Erro no processo");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Método: Fechando conexão e finalizado pendências...");
        }
        return null;
    }
}
