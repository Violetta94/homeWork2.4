package Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RecipeList {

    private Map<Recipe, Integer> recipes = new HashMap<>();

    public void add(Recipe recipe) {
        if (recipe == null) {
            return;
        }
        if (recipes.containsKey(recipe)) {
            Integer productCount = this.recipes.get(recipe);
            this.recipes.put(recipe, ++productCount);
        } else {
            this.recipes.put(recipe,1);
        }
    }

    public void remove (Recipe recipe) {
        recipes.remove(recipe);
        }
}
