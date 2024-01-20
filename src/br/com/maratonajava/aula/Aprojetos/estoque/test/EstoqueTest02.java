package br.com.maratonajava.aula.Aprojetos.estoque.test;

import br.com.maratonajava.aula.Aprojetos.estoque.domain.Stock;
import br.com.maratonajava.aula.Aprojetos.estoque.services.*;
import br.com.maratonajava.aula.Aprojetos.estoque.types.*;

public class EstoqueTest02 {
    public static void main(String[] args) {
        StockServices.newStock();
        StockServices.newStock();
        StockServices.newProduct(0, "iPhone 15", 5_420f, Size.NON_APLICABLE, Color.DARK_GRAY, Brand.IPHONE, Category.ELECTRONICS, 50);
        StockServices.newProduct(0, "Redmi 10C", 699.90f, Size.NON_APLICABLE, Color.RED, Brand.XIAOMI, Category.ELECTRONICS, 43);
        StockServices.newProduct(0, "Notebook HP 256 G9", 2_573.55f, Size.NON_APLICABLE, Color.BLACK, Brand.HP, Category.ELECTRONICS, 10);
        StockServices.removeProductQtd(15, 0, "iphone 15");
        StockReport.showStockReport(0);

        StockServices.newProduct(0, "Poco M4 Pro 5G", 985f , Size.NON_APLICABLE , Color.BLUE, Brand.XIAOMI, Category.ELECTRONICS, 25);

        StockServices.removeProductQtd(10, 0, "notebook hp 256 g9");

        StockReport.showStockReport(0);
    }
}
