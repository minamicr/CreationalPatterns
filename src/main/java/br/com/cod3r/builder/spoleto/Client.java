package br.com.cod3r.builder.spoleto;

import br.com.cod3r.builder.spoleto.model.MealModel;
import br.com.cod3r.builder.spoleto.model.MealSize;

public class Client {

  public static void main(String[] args) {
    MealModel meal = new MealModel.Builder()
        .defineMealSize(MealSize.M)
        .addSauces("molho tomate", "molho branco")
        .addTopings("azeitona", "cebola", "alho", "queijo", "milho", "ervilha")
        .cheeseOrdered(true)
        .toastsOrdered(true)
        .pepperOrdered(false)
        .getMeal();

    System.out.println("Meal " + meal.toString());

  }

}
