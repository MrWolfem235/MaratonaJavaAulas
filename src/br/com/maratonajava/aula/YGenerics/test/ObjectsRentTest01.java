package br.com.maratonajava.aula.YGenerics.test;

import br.com.maratonajava.aula.YGenerics.domain.Barco;
import br.com.maratonajava.aula.YGenerics.domain.Carro;
import br.com.maratonajava.aula.YGenerics.services.RentalServices;

import java.util.ArrayList;
import java.util.List;

public class ObjectsRentTest01 {
    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Yate")));
        ArrayList<Carro> carros = new ArrayList<>(List.of(new Carro("Mercedez"), new Carro("Fusca"), new Carro("Gol Quadrado")));
        RentalServices<Carro> carroRentalServices = new RentalServices<>(carros);
        RentalServices<Barco> barcoRentalServices = new RentalServices<>(barcos);

        carroRentalServices.showAvailableObjetos();
        List<Carro> myRentedCarros = new ArrayList<>();
        myRentedCarros.add(carroRentalServices.rentAnAvailableObject());
        carroRentalServices.showAvailableObjetos();
        carroRentalServices.returnRentedObject(myRentedCarros.removeFirst());
        carroRentalServices.showAvailableObjetos();

//        barcoRentalServices.showAvailableObjetos();
//        List<Barco> myRentedBarcos = new ArrayList<>();
//        myRentedBarcos.add(barcoRentalServices.rentAnAvailableObject());
//        barcoRentalServices.showAvailableObjetos();
//        barcoRentalServices.returnRentedObject(myRentedBarcos.removeFirst());
//        barcoRentalServices.showAvailableObjetos();
    }
}
