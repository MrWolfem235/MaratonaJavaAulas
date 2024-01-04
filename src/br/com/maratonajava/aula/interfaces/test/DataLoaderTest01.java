package br.com.maratonajava.aula.interfaces.test;

import br.com.maratonajava.aula.interfaces.domain.*;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        
        DataBaseLoader dbl = new DataBaseLoader();
        FileDataLoader fdl = new FileDataLoader();

        dbl.load();
        fdl.load();

        dbl.remove();
        fdl.remove();

        dbl.checkPermission();
        fdl.checkPermission();

        DataLoader.checkPermision();

    }
}
