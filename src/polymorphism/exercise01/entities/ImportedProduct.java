package src.polymorphism.exercise01.entities;

public class ImportedProduct extends Product {

    private static double customsFee = 10.0;

    public ImportedProduct(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public String priceTag() {
        return name + " $" + (price + customsFee) + " Customs Fee: $" + customsFee;
    }

}
