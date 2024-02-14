package br.com.maratonajava.aula.Aprojects.estoque.services;

import br.com.maratonajava.aula.Aprojects.estoque.domain.*;
import br.com.maratonajava.aula.Aprojects.estoque.exceptions.InsuficientAmountException;
import br.com.maratonajava.aula.Aprojects.estoque.exceptions.ProductNotFoundException;
import br.com.maratonajava.aula.Aprojects.estoque.exceptions.StockNotFoundException;
import br.com.maratonajava.aula.Aprojects.estoque.types.*;

//service with stock and products manipulation functions
public abstract class StockServices {

    //instatiate a new stock, it is listed by Stock.StockUnits
    public static Stock newStock(){
        Stock stock = new Stock();
        return stock;
    }

    //instantiate a new product int this stock, and for functional purpose return the new product
    public static Product newProduct(int stockIndex, String name, float price, Size size, Color color, Brand brand, Category category){
        Stock stock = stockByIndex(stockIndex);
        Product product = new Product(name, price, size, color, brand, category);
        stock.getProducts().add(product);
        return product;
    }

    //newProduct supercharge with qtd
    public static Product newProduct(int stockIndex, String name, float price, Size size, Color color, Brand brand, Category category, int iniQtd){
        Stock stock = stockByIndex(stockIndex);
        Product product = new Product(name, price, size, color, brand, category);
        stock.getProducts().add(product);
        addProductQtd(iniQtd, stockIndex, name);
        return product;
    }

    private static int modifyProductQtd(int qtd, int stockIndex, String productName){//modify products Qtd and return the new amount
        Product product = productByName(stockIndex, productName);
        product.setQtd(product.getQtd() + qtd);
        return product.getQtd();
    }
    
    public static int addProductQtd(int qtd, int stockIndex, String productName){
        return modifyProductQtd(qtd, stockIndex, productName);
    }
    
    public static int removeProductQtd(int qtd, int stockIndex, String productName){
        Product product = productByName(stockIndex, productName);
        if (product.getQtd() < qtd){//if it's a substracting action and the amount is insuficient for the subtract, throw this exception
            throw new InsuficientAmountException("Erro: Insuficient amount to subtract");
        }
        return modifyProductQtd(-qtd, stockIndex, productName);
    }

    public static String productInfo(int stockIndex, String productName){//make a search the product info based on wich stock and product's name
        Stock stock = stockByIndex(stockIndex);
        Product product = productByName (stockIndex, productName);//get product based in name
        int indexOfProductInStock = stock.getProducts().indexOf(product);//get index of the product in the stock products
        String productInfo = stock.getProducts().get(indexOfProductInStock).toString();//get the info
        System.out.println(productInfo);//print the .toString()
        return productInfo;//return the .toString() for function purpose
    }

    public static String stockInfo(int stockIndex){
        Stock stock = stockByIndex(stockIndex);
        System.out.println(stock.toString());
        return stock.toString();
    }

    public static Product productByName (int stockIndex, String productName){//make a un-case sensitive search of the product based on a String name
        Stock stock = stockByIndex(stockIndex);
        for (Product product : stock.getProducts()){//iterates stock products until find product with the correct name
            if (product.getName().toLowerCase().equals(productName.toLowerCase())){//comparation with each products name
                return product;
            }//when find return this product
        }
        throw new ProductNotFoundException("ERROR: Was not possible to locate product with name "+productName);//if not found throw this
    }

    public static Stock stockByIndex(int index){
        try{
        return Stock.getStockUnits().get(index);
        }catch(IndexOutOfBoundsException e){
            throw new StockNotFoundException("ERROR: Was not possible to locate stock at index "+index);
        }
    }

    public static int QtdOfAll(int stockIndex){
        Stock stock = stockByIndex(stockIndex);
        int qtdOfAll = 0;
        for (Product product : stock.getProducts()){
            qtdOfAll += product.getQtd();
        }
        return qtdOfAll; 
    }
}
