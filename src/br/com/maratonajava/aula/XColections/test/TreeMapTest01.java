package br.com.maratonajava.aula.XColections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest01 {
    public static void main(String[] args) {
        //TreeMap uses the natural order of the keys, and the red-black-tree
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("G", "Letra G");
        map.put("D", "Letra D");
        map.put("F", "Letra F");
        map.put("C", "Letra C");
        map.put("E", "Letra E");
        map.put("B", "Letra B");
        map.put("A", "Letra A");

//        for(Map.Entry<String, String> entry:map.entrySet()){
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(String.format("[%s] -> %s", key,value));
//        }

        System.out.println(map.ceilingKey("E"));
    }
}
