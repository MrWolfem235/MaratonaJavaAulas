package br.com.maratonajava.aula.Aprojetos.estoque.domain;

import br.com.maratonajava.aula.Aprojetos.estoque.types.*;

public class Product {
    private String name;
    private float price;
    private int qtd;
    private String info;
    private Size size;
    private Color color;
    private Brand brand;
    private Category category;

    public Product(String name, float price, String info, Size size, Color color, Brand brand,
            Category category) {
        this.name = name;
        this.price = price;
        this.info = info;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.category = category;
    }
    
    //no info required constructor
    public Product(String name, float price, Size size, Color color, Brand brand,
            Category category) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.category = category;
    }

    @Override
    public String toString() {
        return "--- Product --- \n-name: " + name + "\n-price: " + price + "\n-qtd: " + qtd + "\n-info: " + info + "\n-size: "
                + size + "\n-color: " + color + "\n-brand: " + brand + "\n-category: " + category;
    }

    public String simpleToString() { //only essential information toString
        return "--- " + name + "\n  qtd: " + qtd + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    
    
}
