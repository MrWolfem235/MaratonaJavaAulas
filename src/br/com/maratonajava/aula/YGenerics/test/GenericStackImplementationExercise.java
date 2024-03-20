package br.com.maratonajava.aula.YGenerics.test;

import br.com.maratonajava.aula.YGenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

class  GenericStack <T>{
    ArrayList<T> objects = new ArrayList<>(10);

    public GenericStack(List<T> objects) {
        this.objects = new ArrayList<>(objects);
    }

    public GenericStack() {
    }

    public void push(T objectToPush){
        objects.add(objectToPush);
    }

    public T pop(){
        return objects.removeLast();
    }

    public T peek(){
        return objects.getLast();
    }

    public boolean isEmpty(){
        return objects.isEmpty();
    }

    public boolean isNotEmpty(){
        return !objects.isEmpty();
    }
}

public class GenericStackImplementationExercise {
    public static void main(String[] args) {
        GenericStack<Barco> genericStack = new GenericStack();
        genericStack.push(new Barco("Lancha"));
        genericStack.push(new Barco("Yate"));
        genericStack.push(new Barco("Navio"));
        genericStack.push(new Barco("Bote"));

        while(genericStack.isNotEmpty()){
            System.out.println(genericStack.pop());
        }
    }
}
