package exercises.Programmieren1.Plaetzchendose;

import java.util.ArrayList;
import java.util.List;

public class StuffedCookie extends Cookie {
	private final Recipe jam;

	public StuffedCookie(String name, Recipe dough, Recipe jam) {
		super(name, dough);
		this.jam = jam;
	}

	@Override
	public List<Ingredient> getIngredients() {
		List<Ingredient> ingredientsAll = new ArrayList<>();
		List<Ingredient> ingredientsJam = new ArrayList<>();
		ingredientsAll.addAll(dough.getIngredients());
		ingredientsAll.addAll(ingredientsJam);
		return ingredientsAll;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", dough=" + dough.toString() + ", jam=" + jam.toString() + "]";
	}

}
