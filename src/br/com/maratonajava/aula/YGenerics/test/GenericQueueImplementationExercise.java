package br.com.maratonajava.aula.YGenerics.test;

import br.com.maratonajava.aula.XColections.domain.Character;

import java.util.ArrayList;
import java.util.List;

class GenericQueue <T> {
    List<T> objects = new ArrayList<>();

    public GenericQueue(List<T> objects) {
        this.objects = objects;
    }

    public GenericQueue() {
    }

    public void enqueue (T objectToEnqueue){
        objects.add(objectToEnqueue);
    }

    public T dequeue (){
        return objects.removeFirst();
    }

    public T peek (){
        return objects.getFirst();
    }

    public boolean isEmpty(){
        return objects.isEmpty();
    }

    public boolean isNotEmpty(){
        return !objects.isEmpty();
    }
}

public class GenericQueueImplementationExercise {
    public static void main(String[] args) {
        GenericQueue<Character> genericQueue = new GenericQueue<>();
        genericQueue.enqueue(new Character("Sonic"));
        genericQueue.enqueue(new Character("Robotnic"));
        genericQueue.enqueue(new Character("Tails"));
        genericQueue.enqueue(new Character("Rose"));
        genericQueue.enqueue(new Character("Amy"));
        genericQueue.enqueue(new Character("Knucles"));

        while(genericQueue.isNotEmpty()){
            System.out.println(genericQueue.dequeue());
        }
    }
}
