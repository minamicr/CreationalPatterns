package br.com.cod3r.builder.meal;

import br.com.cod3r.builder.meal.model.FastFoodMeal;
import br.com.cod3r.builder.meal.model.FastFoodMeal.Builder;

public class Client {
	
	public static void main(String[] args) {
		//make killer meal
		FastFoodMeal meal = new Builder()
				.addSide("friers")
				.addDrink("coke")
				.addDessert("apple pie")
				.addMain("cheese burger")
				.addGift("snoopy toy")
				.getMeal();

		System.out.println("kill meal: " + meal);

		//make soft meal
		FastFoodMeal softMeal = new Builder()
				.addDrink("natural juice")
				.addDessert("apple")
				.addMain("vegan hamburger")
				.getMeal();

		System.out.println("soft meal: " + softMeal);


	}
}