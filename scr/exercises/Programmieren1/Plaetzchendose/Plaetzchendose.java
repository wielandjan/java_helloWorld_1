package exercises.Programmieren1.Plaetzchendose;

import java.io.File;
import java.io.FileNotFoundException;

public class Plaetzchendose {
	public static void main(String[] args) throws FileNotFoundException {
		CookieJar cookiejar = new CookieJar();
		Recipe dough = new Recipe("dough");

		File fileDouge = new File("scr/exercises/Programmieren1/Plaetzchendose/dough.txt");
		IngredientsReader readerDouge = new IngredientsReader();

		for (Ingredient ingredient : readerDouge.readIngredients(fileDouge)) {
			dough.addIngredient(ingredient);
		}

		File fileJam = new File("scr/exercises/Programmieren1/Plaetzchendose/jam.txt");
		IngredientsReader readerJam = new IngredientsReader();

		Recipe jam = new Recipe("jam");
		for (Ingredient ingredient : readerJam.readIngredients(fileJam)) {
			jam.addIngredient(ingredient);
		}

		Cookie c1 = new Cookie("c1", dough);
		Cookie c2 = new Cookie("c2", dough);
		Cookie c3 = new Cookie("c3", dough);
		StuffedCookie sc1 = new StuffedCookie("sc1", dough, jam);
		StuffedCookie sc2 = new StuffedCookie("sc2", dough, jam);

		cookiejar.addCookie(c1);
		cookiejar.addCookie(c2);
		cookiejar.addCookie(c3);
		cookiejar.addCookie(sc1);
		cookiejar.addCookie(sc2);

		StuffedCookie stuffedcookie = cookiejar.getStuffedCookie();

		System.out.println(stuffedcookie.toString());

		System.out.println(stuffedcookie.getName());

	}
}
