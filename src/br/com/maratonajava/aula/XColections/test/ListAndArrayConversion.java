package br.com.maratonajava.aula.XColections.test;

import br.com.maratonajava.aula.XColections.domain.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAndArrayConversion {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>(List.of(1,3,7,8,4,2,2,345,62,34));

        Integer[] numbersListToArray = numbersList.toArray(new Integer[0]);

        List<Integer> numberArrayToList = new ArrayList<>(List.of(numbersListToArray));

        numberArrayToList.set(0, 100);
        System.out.println("Array: "+Arrays.toString(                                                                                                                             numbersListToArray));
        System.out.println("List: "+numberArrayToList);
    }
}
