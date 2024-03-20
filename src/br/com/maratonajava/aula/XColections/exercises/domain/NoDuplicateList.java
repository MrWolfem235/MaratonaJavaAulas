package br.com.maratonajava.aula.XColections.exercises.domain;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NoDuplicateList {
    private List<Integer> intList = new ArrayList<>();

    public void put (Integer integer){
        if (!intList.contains(integer)) {
            intList.add(integer);
        }
    }

    public List<Integer> getSet() {
        return intList;
    }

    public void inverter(){
            intList = intList.reversed();
    }
}
