package br.com.maratonajava.aula.YGenerics.test;

import br.com.maratonajava.aula.YGenerics.domain.Barco;
import br.com.maratonajava.aula.YGenerics.domain.Carro;
import br.com.maratonajava.aula.YGenerics.services.BarcoRentalServices;
import br.com.maratonajava.aula.YGenerics.services.CarroRentalServices;

import java.util.ArrayList;
import java.util.List;

public class VeichlesRentTest01 {
    public static void main(String[] args) {
//        CarroRentalServices carroRentalServices = new CarroRentalServices();
//
//        carroRentalServices.showAvailableCarros();
//        List<Carro> myRentedCarros = new ArrayList<>();
//        myRentedCarros.add(carroRentalServices.rentAnAvailableCar());
//        carroRentalServices.showAvailableCarros();
//        carroRentalServices.returnRentedCarro(myRentedCarros.removeFirst());
//        carroRentalServices.showAvailableCarros();

        BarcoRentalServices carroRentalServices = new BarcoRentalServices();

        carroRentalServices.showAvailableBarcos();
        List<Barco> myRentedBarcos = new ArrayList<>();
        myRentedBarcos.add(carroRentalServices.rentAnAvailableBarcos());
        carroRentalServices.showAvailableBarcos();
        carroRentalServices.returnRentedBarco(myRentedBarcos.removeFirst());
        carroRentalServices.showAvailableBarcos();

    }
}
