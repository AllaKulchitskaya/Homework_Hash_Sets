import product.Product;
import product.ProductList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product bananas = new Product("бананы", 65.6, 1);
        Product oranges = new Product("апельсины", 112.6, 2);
        Product chicken = new Product("курица", 289.9, 2);
        Product potatoes = new Product("картофель", 87.7, 3);
        Product carrot = new Product("морковь", 25.9, 1);
        Product tomatoes = new Product("помидоры", 86.3, 1);
        Product rice = new Product("рис", 369.4, 5);
        Product sugar = new Product("сахар", 136.2, 2);
        Product flour = new Product("мука", 115.6, 2);

        Set<Product> productSet = new HashSet<>();

        ProductList productList = new ProductList(productSet);
        productList.addFood(bananas);
        productList.addFood(oranges);
        productList.addFood(chicken);
        productList.addFood(potatoes);
        productList.addFood(carrot);
        productList.addFood(tomatoes);

        System.out.println(Arrays.toString(productList.getProductList().toArray()));

        productList.removeFood(oranges);
        productList.addFood(carrot);

    }
}