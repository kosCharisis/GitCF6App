package gr.aueb.cf.ch20.exer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    private static final List<Product> products = List.of(
            new Product(1,"Car", 100, 10),
            new Product(2,"Bike", 150, 15),
            new Product(3,"Airplane", 1000, 5),
            new Product(4,"Boat", 500, 7));

    public static void main(String[] args) {

        List<Product> productList = getFilteredProducts(products, product -> product.getQuantity() >=7);

//        printProducts(productList, product -> product.printInstanceProduct());
//        printProducts(productList, product -> product.printStaticProduct(product));
//        printProducts(productList, product -> System.out.println(product));

        printProducts(productList, Product::printInstanceProduct);
        printProducts(productList, Product::printStaticProduct);
        printProducts(productList, System.out::println );

    }

    public static void printProducts(List<Product> products, Consumer<Product> consumer) {
        for (Product product : products) {
            consumer.accept(product);
        }
    }
    public static List<Product> getFilteredProducts(List<Product> products, Predicate<Product> filter) {
        List<Product> productsToReturn = new ArrayList<>();

        for (Product product : products) {
            if (filter.test(product)) {
                productsToReturn.add(product);
            }
        }
        return productsToReturn;
    }
}
