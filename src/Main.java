import product.Product;
import product.ProductList;
import product.Recipe;
import product.RecipeList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbersSet = new HashSet<>();
        while (numbersSet.size() < 20) {
            numbersSet.add(random.nextInt(1000));
        }
        System.out.println(numbersSet);

        Iterator<Integer> iterator = numbersSet.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println(numbersSet);
    }
}