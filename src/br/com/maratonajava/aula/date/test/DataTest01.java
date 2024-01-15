package br.com.maratonajava.aula.date.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) {
        
        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

        System.out.println(dateFormat.format(date.getTime()));

        long umDiaEmMilisegundos = 1000 * 60 * 60 * 24;
        long umaHoraEmMilisegundos = 1000 * 60 * 60;

        System.out.println(dateFormat.format(date.getTime()+umDiaEmMilisegundos));
        System.out.println(dateFormat.format(date.getTime()+umaHoraEmMilisegundos));

    }    
}

/*
 * Date foi uma das primeiras classes a implementar funcionalidades de tempo ao Java
 * considerada obsoleta por não considerar fuso-horários e outros parâmetros
 * foi substituída por outros pacotes mais atuais
 * 
 * Essa classe conta o tempo em milisegundos desde 1/1/1970 (Tempo UNIX). 
 */