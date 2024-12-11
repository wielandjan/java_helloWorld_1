package exercises.Programmieren1.Plaetzchendose;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private final String name;
	private final List<Ingredient> ingredients;

	public Recipe(String name) {
		this.name = name;
		ingredients = new ArrayList<>();
	}

	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public String toString() {
		String sIngredients = "[";
		for (Ingredient ingredient : ingredients) {
			sIngredients = sIngredients + ingredient.getName() + ",";
		}

		sIngredients = sIngredients.substring(0, sIngredients.length() - 1);
		sIngredients = sIngredients + "]";
		return "[name=" + name + ",ingredients=" + sIngredients + "]";

	}
}