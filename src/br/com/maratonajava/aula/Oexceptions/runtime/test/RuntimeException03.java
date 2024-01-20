package br.com.maratonajava.aula.Oexceptions.runtime.test;

import java.io.IOException;

public class RuntimeException03 {
    public static void main(String[] args) {
        try{
            throw new IOException();
        }catch( ArithmeticException | NullPointerException | IndexOutOfBoundsException e){
            System.out.println("Dentro do ArithmeticException | NullPointerException | IndexOutOfBoundsException");
        }catch (Exception e){
            System.out.println("Dentro do Exception");
        }
    }
}

/*
 * Com o multi-catch é possível capturar mais de um tipo de exceção em um único catch
 * e fazer um único tratamento para todas essas exceções
 */