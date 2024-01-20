package br.com.maratonajava.aula.Oexceptions.runtime.test;

public class RuntimeException02 {
    public static void main(String[] args) {
    
        try{ 
            Object a = null;
            System.out.println(a.toString());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }catch(ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch(Exception e){
            System.out.println("Dentro do Exception");
        }

    }
}

/*
 * É possível capturar mais de um exceção por try, trazendo a possibilidade de tratamentos
 * diferentes para cada tipo de erro, e no final se não for reconhecido nenhuma das exceções
 * capturamos como uma Exception genérica
 */