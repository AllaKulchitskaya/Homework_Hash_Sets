package product;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> productList = new HashSet<>();

    public ProductList(Set<Product> productList) {
        this.productList = productList;
    }

    public Set<Product> getProductList() {
        return productList;
    }

    public void setProductList(Set<Product> productList) {
        this.productList = productList;
    }

    public void addFood(Product product) {
        if (productList.contains(product)) {
            throw new IllegalArgumentException("В списке уже есть " + product.getFood());
        }
        productList.add(product);
    }

    public void removeFood(Product product) {
        if (!productList.contains(product)) {
            throw new IllegalArgumentException("В списке нет такого продукта");
        }
        productList.remove(product);
        System.out.println("Продукт " + product.getFood() + " вычеркнут из списка");
    }
}
