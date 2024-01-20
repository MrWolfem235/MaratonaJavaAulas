package br.com.maratonajava.aula.Aprojetos.estoque.domain;

import java.util.ArrayList;

public class Stock {
    //list to count all stock units instantied
    private static ArrayList<Stock> stockUnits = new ArrayList<Stock>();
    private String unit;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Stock() {
        //by making an instance, it will be added to the stock list
        Stock.stockUnits.add(this);
    }

    public String toString(){
        String productsInfo = "";
        for (Product product : products){
            productsInfo += product.simpleToString();
        }
        return "--- Stock ---\n-Products: \n" + productsInfo;
    }

    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public static ArrayList<Stock> getStockUnits() {
        return stockUnits;
    }

    public static void setStockUnits(ArrayList<Stock> stockUnits) {
        Stock.stockUnits = stockUnits;
    }

    
}
