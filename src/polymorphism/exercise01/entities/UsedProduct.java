package src.polymorphism.exercise01.entities;

import java.util.Date;

public class UsedProduct extends Product {

    private String manufactureDate;

    public UsedProduct(String nome, Double preco, String manufactureDate) {
        super(nome, preco);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return name + " (used)" + " $" + price + " (Manufacture date: " + manufactureDate +")";
    }
}
