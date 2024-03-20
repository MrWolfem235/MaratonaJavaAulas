package br.com.maratonajava.aula.YGenerics.services;

import br.com.maratonajava.aula.YGenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentalServices {
    private List<Carro> carrosAvailable = new ArrayList<>(List.of(new Carro("Chevrolet"), new Carro("Fuscão"), new Carro("Mercedez")));

    public Carro rentAnAvailableCar (){
        System.out.println("Verificando carros disponíveis...");
        Carro selectedCarroForRent = carrosAvailable.removeFirst();
        System.out.println("Carro alugado [ "+selectedCarroForRent.getName()+" ]");
        return selectedCarroForRent;
    }

    public void returnRentedCarro (Carro rentedCarroToReturn){
        System.out.println("Devolvendo carro alugado...");
        carrosAvailable.add(rentedCarroToReturn);
        System.out.println("Carro Devolvido com sucesso.\nMuito Obrigado!!!");
    }

    public void showAvailableCarros(){
        System.out.println("=== CARROS DISPONÍVEIS ===");
        for (Carro carro : carrosAvailable) {
            System.out.println("    -: "+carro.getName());
        }
        System.out.println("==========================");

    }
}
