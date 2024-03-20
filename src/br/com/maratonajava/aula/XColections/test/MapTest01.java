package br.com.maratonajava.aula.XColections.test;

import br.com.maratonajava.aula.XColections.domain.Carro;
import br.com.maratonajava.aula.XColections.util.NumberFormatUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ResourceBundle;

//
public class MapTest01 {
    public static void main(String[] args) {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("Espécies de formiga", 1000000d);
        map.put("População mundial",8000000000d);
        map.put("População brasileira",214300000d);
        map.put("População chinesa", 1412000000d);
        map.put("Elétrons no universo", 15747724136275002577605d);
        map.put("Diâmetro do universo (milhas)",54000000000000000000000d);

//        for(String key : map.keySet()){
//            double value = map.get(key);
//            System.out.println(key + " = " + NumberFormatUtil.format(value));
//        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            String formatedValue = NumberFormatUtil.format(value, true);
            System.out.println(key + " = " + formatedValue);
        }
    }
}
