package br.com.maratonajava.aula.XColections.test;

import br.com.maratonajava.aula.XColections.domain.Character;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set< Character> charactersHashSet = new HashSet<>();

        charactersHashSet.add(new Character(7, "Goku", 9000, 10));
        charactersHashSet.add(new Character(8, "Vegeta", 8500, 9));
        charactersHashSet.add(new Character(10, "Kratos", 100, 7));
        charactersHashSet.add(new Character(11, "Batman", 12, 11));
        charactersHashSet.add(new Character(12, "Spider-Man", 15, 10));
        charactersHashSet.add(new Character(13, "Wonder Woman", 18, 9));
        charactersHashSet.add(new Character(14, "Iron Man", 20, 12));
        charactersHashSet.add(new Character(15, "Thor", 19, 11));
        charactersHashSet.add(new Character(16, "Black Widow", 14, 13));
        charactersHashSet.add(new Character(17, "Hulk", 25, 8));
        charactersHashSet.add(new Character(18, "Captain America", 16, 10));
        charactersHashSet.add(new Character(19, "Wolverine", 17, 15));
        charactersHashSet.add(new Character(20, "Superman", 9001, 10));

        for (Character character : charactersHashSet){
            System.out.println(character);
        }
    }
}
