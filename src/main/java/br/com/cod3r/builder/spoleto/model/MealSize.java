package br.com.cod3r.builder.spoleto.model;

public enum MealSize {
  P("kids meal"),
  M("adult meal"),
  G("family meal");

  String mealSize;

  MealSize(String mealSize){
    this.mealSize = mealSize;
  }

  @Override
  public String toString() {
    return this.name() + " - " +  this.mealSize;
  }
}
