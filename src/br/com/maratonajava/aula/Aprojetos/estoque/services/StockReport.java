package br.com.maratonajava.aula.Aprojetos.estoque.services;

import br.com.maratonajava.aula.Aprojetos.estoque.domain.*;

public abstract class StockReport {

    public static String showStockReport (int stockIndex){
        Stock stock = StockServices.stockByIndex(stockIndex);
        String stockReport = "--- Stock "+stockIndex+" Report ---\n" + getProductsInfoForReport(stockIndex);
        System.out.println(stockReport);
        return stockReport;
    }

    private static String getProductsInfoForReport (int stockIndex){
        Stock stock = StockServices.stockByIndex(stockIndex);
        String productsInfoForReport = "";
        int qtdOfAll = StockServices.QtdOfAll(stockIndex);
        // Format reportStringFormat = new Fo
        for (Product product : stock.getProducts()){
            
            productsInfoForReport += String.format("- %20s    Qtd: %3s     %.1f%%\n", product.getName(), product.getQtd(), (((float) product.getQtd() / (float) qtdOfAll)*100));
        }
        productsInfoForReport += String.format("- Tot.: %d\n", qtdOfAll);
        return productsInfoForReport;
    }
     
}
