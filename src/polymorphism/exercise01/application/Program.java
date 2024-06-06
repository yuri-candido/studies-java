package src.polymorphism.exercise01.application;

import src.polymorphism.exercise01.entities.ImportedProduct;
import src.polymorphism.exercise01.entities.Product;
import src.polymorphism.exercise01.entities.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<Product> product = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many products do you want to enter?");
        int quantity = sc.nextInt();

        for(int i =0; i < quantity; i++) {

            System.out.println("Product " + (i + 1) + " :");
            System.out.println("Is it common, used or imported? c/u/i");
            String productType = sc.next();

            if(productType.equals("c")) {

                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Price");
                Double price = sc.nextDouble();

                product.add(new Product(name, price));
            }

            if(productType.equals("u")) {

                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Price");
                Double price = sc.nextDouble();
                System.out.println("Data");
                String data = sc.next();

                product.add(new UsedProduct(name, price, data));
            }

            if(productType.equals("i")) {

                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Price");
                Double price = sc.nextDouble();
                product.add(new ImportedProduct(name, price));
            }

        }

        for (Product products : product ) {
            System.out.println(products.priceTag());
        }

    }
}
