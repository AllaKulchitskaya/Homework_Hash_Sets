package product;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipeList = new HashSet<>();

    public RecipeList(Set<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public Set<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(Set<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public void addRecipe(Recipe recipe) {
        if (recipeList.contains(recipe)) {
            throw new IllegalArgumentException("Рецепт с таким названием уже добавлен");
        }
        recipeList.add(recipe);
    }
}
