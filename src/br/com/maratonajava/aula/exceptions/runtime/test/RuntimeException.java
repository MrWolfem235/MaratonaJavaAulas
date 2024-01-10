package br.com.maratonajava.aula.exceptions.runtime.test;

public class RuntimeException {
    public static void main(String[] args) {
        Object n = null;
        System.out.println(n);
    }
}
/*
 * As Exceptions não checadas, não obrigatoriamente precisam de um tratamento, porém pelas
 * boas condutas é fundamental integrar um sistema de tratamento de erros que evitam que o 
 * sistema tenha um comportamento inesperado.
 */