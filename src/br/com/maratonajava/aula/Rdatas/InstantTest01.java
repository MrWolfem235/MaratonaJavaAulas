package br.com.maratonajava.aula.Rdatas;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant instantTime = Instant.now();//get zulu time, universal pattern time for data base register
        int marks = 100;
        for (int i = 0; i > -1; i++){
        System.out.println("mark : "+(Instant.now().getNano()-instantTime.getNano()));
        }
    }
}
