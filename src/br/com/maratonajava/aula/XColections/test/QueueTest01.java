package br.com.maratonajava.aula.XColections.test;

import br.com.maratonajava.aula.XColections.domain.Character;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<Character> queue = new PriorityQueue<>(new CharacterComparatorByIntelligence());
        queue.offer(new Character("Goku", 9000, 10));
        queue.offer(new Character("Vegeta", 8500, 9));
        queue.offer(new Character("Kratos", 100, 7));
        queue.offer(new Character("Batman", 12, 11));
        queue.offer(new Character("Spider-Man", 15, 10));
        queue.offer(new Character("Wonder Woman", 18, 9));
        queue.offer(new Character("Iron Man", 20, 12));
        queue.offer(new Character("Thor", 19, 11));
        queue.offer(new Character("Black Widow", 14, 13));
        queue.offer(new Character("Hulk", 25, 8));
        queue.offer(new Character("Captain America", 16, 10));
        queue.offer(new Character("Wolverine", 17, 15));
        queue.offer(new Character("Superman", 9001, 10));

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}

class CharacterComparatorByStrength implements Comparator<Character>{
    @Override
    public int compare(Character t2, Character t1) {
        return Integer.compare(t2.getForça(),t1.getForça());
    }
}

class CharacterComparatorByIntelligence implements Comparator<Character>{
    @Override
    public int compare(Character t2, Character t1) {
        return Integer.compare(t2.getInteligencia(),t1.getInteligencia());
    }
}
