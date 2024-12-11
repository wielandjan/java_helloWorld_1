package exercises.Programmieren1.Plaetzchendose;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngredientsReader {

	public List<Ingredient> readIngredients(File file) throws FileNotFoundException {

		Scanner scanner = new Scanner(file);

		List<Ingredient> ingredients = new ArrayList<>();
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			Ingredient ingredient = new Ingredient(line);
			ingredients.add(ingredient);
		}

		scanner.close();
		return ingredients;

	}
}
