package product;

import java.util.Objects;

public class Product {
    private final String food;
    private final double price;
    private int weight;

    public Product(String food, double price, int weight) {
        if (food == null || food.isBlank() || food.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.food = food;
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.price = price;
        setWeight(weight);
    }

    public String getFood() {
        return food;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(food, product.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food);
    }

    @Override
    public String toString() {
        return food + ", цена - " + price + ", вес - " + weight + " кг";
    }
}
