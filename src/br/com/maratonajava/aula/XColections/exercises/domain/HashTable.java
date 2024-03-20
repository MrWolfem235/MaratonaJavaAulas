package br.com.maratonajava.aula.XColections.exercises.domain;

import javax.management.openmbean.ArrayType;
import java.security.MessageDigest;
import java.util.Map;

public class  HashTable <K, V> {
    K[] keySet;
    V[] valueSet;

    public HashTable() {
        keySet = (K[]) new Object[32];
    }

    public HashTable(int initialSize) {
        keySet = (K[]) new Object[initialSize];
    }

//    public void put(Object key,V value){
//        try {
//            int EntrySetIndex = key.hashCode();
//
//        }catch (IndexOutOfBoundsException e){
//            Byte[] tempKeySet = new Byte[keySet.length*2];
//            V[] tempValueSet = (V[]) new  Object[valueSet.length*2];
//            for (int i = 0; i < keySet.length && i < valueSet.length; i++){
//                tempKeySet[i] = keySet[i];
//                tempValueSet[i] = valueSet[i];
//            }
//            keySet = tempKeySet.clone();
//            valueSet = tempValueSet.clone();
//            put(key, value);
//        }
//    }

}
