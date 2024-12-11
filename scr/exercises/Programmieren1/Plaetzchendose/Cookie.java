package exercises.Programmieren1.Plaetzchendose;

import java.util.List;

public class Cookie {

	protected final String name;

	protected final Recipe dough;

	public Cookie(String name, Recipe dough) {
		this.name = name;
		this.dough = dough;
	}

	public List<Ingredient> getIngredients() {
		return dough.getIngredients();
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "[name=" + name + ", dough=" + dough.toString() + "]";
	}

}