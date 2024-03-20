package br.com.maratonajava.aula.XColections.test;

import br.com.maratonajava.aula.XColections.domain.Character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class OrderCharacterByName implements Comparator<Character>{
    @Override
    public int compare(Character char1, Character char2) {
        return char1.getName().compareTo(char2.getName());
    }
}

class OrderCharacterByStrength implements Comparator<Character>{
    @Override
    public int compare(Character char1, Character char2) {
        Integer char1Forca = Integer.valueOf(char1.getForça());
        Integer char2Forca = Integer.valueOf(char2.getForça());
        return char1Forca.compareTo(char2Forca);
    }
}

class OrderCharacterByInteligence implements Comparator<Character>{
    @Override
    public int compare(Character char1, Character char2) {
        Integer char1inte = Integer.valueOf(char1.getInteligencia());
        Integer char2inte = Integer.valueOf(char2.getInteligencia());
        return char1inte.compareTo(char2inte);
    }
}

public class CharacterSort {
    public static void main(String[] args) {
    List<Character> characters = new ArrayList<>();

        characters.add(new Character("Goku", 9000, 10));
        characters.add(new Character("Vegeta", 8500, 9));
        characters.add(new Character("Kratos", 100, 7));
        characters.add(new Character("Batman", 12, 11));
        characters.add(new Character("Spider-Man", 15, 10));
        characters.add(new Character("Wonder Woman", 18, 9));
        characters.add(new Character("Iron Man", 20, 12));
        characters.add(new Character("Thor", 19, 11));
        characters.add(new Character("Black Widow", 14, 13));
        characters.add(new Character("Hulk", 25, 8));
        characters.add(new Character("Captain America", 16, 10));
        characters.add(new Character("Wolverine", 17, 15));
        characters.add(new Character("Superman", 9001, 10));

        Collections.sort(characters, new OrderCharacterByName());

        for (Character character : characters){
            System.out.println(character);
        }

        System.out.println(Collections.binarySearch(characters,new Character("Vegetas", 8500, 9),new OrderCharacterByName()));
    }
}
