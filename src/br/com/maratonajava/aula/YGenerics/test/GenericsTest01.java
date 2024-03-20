package br.com.maratonajava.aula.YGenerics.test;

import br.com.maratonajava.aula.YGenerics.domain.Animal;
import br.com.maratonajava.aula.YGenerics.domain.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<Animal> animalsList = new ArrayList<>();
        List<Dog> dogsList = new ArrayList<>();
        Dog pluto = new Dog("Pluto", 3, "BloodHound");
        Dog bidu = new Dog("Bidu" ,2, "Schauzer");
        animalsList.add(new Animal("Fish", 1));
        animalsList.add(pluto);
        animalsList.add(bidu);
        dogsList.add(pluto);
        dogsList.add(bidu);

        animalsSong(animalsList);

    }

    static private void animalsSong(List<Animal> animalList){
        for (Animal animal : animalList){
            System.out.print(animal.getName()+"'s song: ");
            animal.song();
        }
    }
}
