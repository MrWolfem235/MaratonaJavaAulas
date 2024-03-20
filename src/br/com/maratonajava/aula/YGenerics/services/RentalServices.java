package br.com.maratonajava.aula.YGenerics.services;

import java.util.List;

public class RentalServices <T> {
    private List<T> objectsAvailable;

    public RentalServices(List<T> objectsAvailable) {
        this.objectsAvailable = objectsAvailable;
    }

    public T rentAnAvailableObject (){
        System.out.println("Verificando objetos disponíveis...");
        T selectedObjectForRent = objectsAvailable.removeFirst();
        System.out.println("Objeto alugado [ "+selectedObjectForRent.toString()+" ]");
        return selectedObjectForRent;
    }

    public void returnRentedObject (T rentedObjectToReturn){
        System.out.println("Devolvendo objeto alugado...");
        objectsAvailable.add(rentedObjectToReturn);
        System.out.println("Objeto Devolvido com sucesso.\nMuito Obrigado!!!");
    }

    public void showAvailableObjetos(){
        System.out.println("=== OBJETOS DISPONÍVEIS ===");
        for (T objeto : objectsAvailable) {
            System.out.println("    -: "+objeto);
        }
        System.out.println("==========================");
    }
}
