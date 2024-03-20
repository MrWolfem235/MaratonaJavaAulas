package br.com.maratonajava.aula.XColections.test;

import br.com.maratonajava.aula.XColections.domain.Carro;
import br.com.maratonajava.aula.XColections.domain.Character;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Character, Carro> corredores = new HashMap<>();
        Character chr1 = new Character("Jotaro Kujo");
        Character chr2 = new Character("Dio Brando");
        Carro car1 = new Carro("Chevrolet",1997);
        Carro car2 = new Carro("Honda",1997);
        Carro car3 = new Carro("Wolksvagen",1997);

        corredores.put(chr1, car1);
        corredores.put(chr2, car3);


        displayCorredoresDebugInfo(corredores);
//        displayCorresdoresMap(corredores);
    }

    static void displayCorresdoresMap (Map<Character, Carro> map){
        for (Map.Entry<Character, Carro> entry : map.entrySet()) {
            Character character = entry.getKey();
            Carro carro = entry.getValue();
            System.out.println(character.getName()+" -> "+carro.getModelo());
        }

    }

    static void displayCorredoresDebugInfo (Map<Character, Carro> map){
        for (Map.Entry<Character, Carro> entry : map.entrySet()) {
            Character character = entry.getKey();
            Carro carro = entry.getValue();
            System.out.println(character+"\n || \n"+carro);
        }
    }
}
