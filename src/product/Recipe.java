package product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final ProductList recipeProducts;
    private final double recipeProductsPrice;
    private final String recipeName;

    public Recipe(ProductList recipeProducts, double recipeProductsPrice, String recipeName) {
        this.recipeProducts = recipeProducts;
        this.recipeProductsPrice = recipeProductsPrice;
        this.recipeName = recipeName;
    }

    public ProductList getRecipeProducts() {
        return recipeProducts;
    }

    public double getRecipeProductsPrice() {
        return recipeProductsPrice;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return recipeName;
    }
}
