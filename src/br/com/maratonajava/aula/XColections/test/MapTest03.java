package br.com.maratonajava.aula.XColections.test;

import br.com.maratonajava.aula.XColections.domain.Carro;
import br.com.maratonajava.aula.XColections.domain.Character;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        Map<Character, List<Carro> > corredores = new HashMap<>();

        Character chr1 = new Character("Jotaro Kujo");
        Character chr2 = new Character("Dio Brando");
        Carro car1 = new Carro("Chevrolet",1997);
        Carro car2 = new Carro("Honda",1997);
        Carro car3 = new Carro("Wolksvagen",1997);
        Carro car4 = new Carro("Maverik",1950);
        List<Carro> chr1Cars = new ArrayList<>(List.of(car1, car2, car4));
        List<Carro> chr2Cars = new ArrayList<>(List.of(car2, car3, car3));

        corredores.put(chr1, chr1Cars);
        corredores.put(chr2, chr2Cars);

        for(Map.Entry<Character, List<Carro>> entry : corredores.entrySet()){
            Character character = entry.getKey();
            List<Carro> carroList = entry.getValue();
            new Scanner(System.in).nextLine();
            System.out.println(String.format("%20s",character.getName()));
            for (Carro carro : carroList){
                System.out.println(String.format("%30s",carro.getModelo()));
            }
        }
    }
}
