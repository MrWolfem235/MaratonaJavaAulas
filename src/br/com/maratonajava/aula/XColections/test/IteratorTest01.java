package br.com.maratonajava.aula.XColections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("Carro","Casa","Moto","Computador","Mesa","Café"));
        Iterator<String> stringListIterator = stringList.iterator();
//        while(stringListIterator.hasNext()){
//            String element = stringListIterator.next();
//            if (element.equals("Café")) stringListIterator.remove();
//            else System.out.println(element);
//        }
        for (String element : stringList){
            System.out.println(element);
        };
    }
}
