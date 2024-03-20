package br.com.maratonajava.aula.XColections.test;

import br.com.maratonajava.aula.XColections.domain.Character;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class CharacterIdComparator implements Comparator<Character> {
    @Override
    public int compare(Character character, Character t1) {
        return Integer.compare(character.getId(), t1.getId());
    }
}

public class TreeSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Character> navigableSet = new TreeSet<>( new CharacterIdComparator());
        navigableSet.add(new Character(7, "Goku", 9000, 10));
        navigableSet.add(new Character(8, "Vegeta", 8500, 9));
        navigableSet.add(new Character(10, "Kratos", 100, 7));
        navigableSet.add(new Character(11, "Batman", 12, 11));
        navigableSet.add(new Character(12, "Spider-Man", 15, 10));
        navigableSet.add(new Character(13, "Wonder Woman", 18, 9));
        navigableSet.add(new Character(14, "Iron Man", 20, 12));
        navigableSet.add(new Character(15, "Thor", 19, 11));
        navigableSet.add(new Character(16, "Black Widow", 14, 13));
        navigableSet.add(new Character(17, "Hulk", 25, 8));
        navigableSet.add(new Character(18, "Captain America", 16, 10));
        navigableSet.add(new Character(19, "Wolverine", 17, 15));
        navigableSet.add(new Character(20, "Superman", 9001, 10));

        listarSet(navigableSet);

        Character steve = new Character(19, "Steve", 0, 0);
//        navigableSet.add(steve);
        System.out.println("-----------------------");
        System.out.println("Novo personagem: \n"+steve);
        System.out.println("Anterior: \n"+navigableSet.lower(steve));
        System.out.println("Anterior ou igual: \n"+navigableSet.lower(steve));
        System.out.println("Próximo: \n"+navigableSet.higher(steve));
        System.out.println("Próximo ou igual: \n"+navigableSet.higher(steve));
        System.out.println("-----------------------");
        System.out.println("Nova lista:\n------------------------\n");

        listarSet(navigableSet);

    }

    static private void listarSet (NavigableSet<Character> navigableSet){
        for (Character character : navigableSet) {
            System.out.println(character);
        }
    }
}
