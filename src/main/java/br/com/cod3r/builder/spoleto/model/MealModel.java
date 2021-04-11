package br.com.cod3r.builder.spoleto.model;

import java.util.Arrays;
import java.util.List;

public class MealModel {
  private final List<String> topings;
  private final List<String> sauces;
  private final boolean pepperOrdered;
  private final boolean cheeseOrdered;
  private final boolean toastsOrdered;
  private final MealSize size;

  public MealModel(List<String> topings, List<String> sauces, boolean pepperOrdered
      , boolean cheeseOrdered, boolean toastsOrdered, MealSize size){
    this.topings = topings;
    this.sauces = sauces;
    this.pepperOrdered = pepperOrdered;
    this.cheeseOrdered = cheeseOrdered;
    this.toastsOrdered = toastsOrdered;
    this.size = size;
  }

  public List<String> getTopings() {
    return topings;
  }

  public List<String> getSauces() {
    return sauces;
  }

  public boolean isPepperOrdered() {
    return pepperOrdered;
  }

  public boolean isCheeseOrdered() {
    return cheeseOrdered;
  }

  public boolean isToastsOrdered() {
    return toastsOrdered;
  }

  public MealSize size() {
    return size;
  }

  @Override
  public String toString() {
    return "MealModel{" +
        "size=" + size +
        ", topings=" + topings +
        ", sauces=" + sauces +
        ", pepperOrdered=" + pepperOrdered +
        ", cheeseOrdered=" + cheeseOrdered +
        ", toastsOrdered=" + toastsOrdered +
        '}';
  }

  public static class Builder {

      private List<String> topings;
      private List<String> sauces;
      private boolean pepperOrdered;
      private boolean cheeseOrdered;
      private boolean toastsOrdered;
      private MealSize size;

      public Builder() {};
      
      public Builder addTopings(String... topings){
        this.topings = Arrays.asList(topings);
        return this;
      }

      public Builder addSauces(String... sauces){
        this.sauces = Arrays.asList(sauces);
        return this;
      }

      public Builder pepperOrdered(boolean pepperOrdered){
        this.pepperOrdered = pepperOrdered;
        return this;
      }

      public Builder cheeseOrdered(boolean cheeseOrdered) {
        this.cheeseOrdered = cheeseOrdered;
        return this;
      }

      public Builder toastsOrdered(boolean toastsOrdered) {
        this.toastsOrdered = toastsOrdered;
        return this;
      }

      public Builder defineMealSize(MealSize size) {
        this.size = size;
        return this;
      }

      public MealModel getMeal(){
        return new MealModel(topings, sauces, pepperOrdered
          , cheeseOrdered, toastsOrdered, size);
      }
  }
}
