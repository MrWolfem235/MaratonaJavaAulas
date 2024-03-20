package br.com.maratonajava.aula.YGenerics.services;

import br.com.maratonajava.aula.YGenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentalServices {
    private List<Barco> barcosAvailable = new ArrayList<>(List.of(new Barco("Yate"), new Barco("Navio"), new Barco("Bote")));

    public Barco rentAnAvailableBarcos (){
        System.out.println("Verificando barcos disponíveis...");
        Barco selectedBarcoForRent = barcosAvailable.removeFirst();
        System.out.println("Barco alugado [ "+selectedBarcoForRent.getName()+" ]");
        return selectedBarcoForRent;
    }

    public void returnRentedBarco (Barco rentedBarcoToReturn){
        System.out.println("Devolvendo barco alugado...");
        barcosAvailable.add(rentedBarcoToReturn);
        System.out.println("Barco Devolvido com sucesso.\nMuito Obrigado!!!");
    }

    public void showAvailableBarcos(){
        System.out.println("=== BARCOS   DISPONÍVEIS ===");
        for (Barco barco : barcosAvailable) {
            System.out.println("    - "+barco.getName());
        }
        System.out.println("==========================");

    }
}
