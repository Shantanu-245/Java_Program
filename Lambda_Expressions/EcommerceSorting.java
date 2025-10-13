package Lambda_Expressions;

import java.util.*;
class Product {
    String name;
    double price, rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating;
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 75000, 4.5),
            new Product("Phone", 40000, 4.7),
            new Product("Tablet", 30000, 4.2)
        );

        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sorted by Price:");
        products.forEach(p -> System.out.println(p));

        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);
    }
}
