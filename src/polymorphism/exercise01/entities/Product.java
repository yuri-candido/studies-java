package src.polymorphism.exercise01.entities;

public class Product {

    protected String name;
    protected Double price;

    public Product(String nome, Double preco) {
        this.name = nome;
        this.price = preco;
    }

    public String priceTag() {
        return name + " $" +price;
    }

}
