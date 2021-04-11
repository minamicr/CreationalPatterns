package br.com.cod3r.builder.meal.model;

public class FastFoodMeal {

	final private String drink;
	final private String main;
	final private String side;
	final private String dessert;
	final private String gift;

	private FastFoodMeal(String drink, String main, String side, String dessert, String gift){
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;

	}
	public String getDrink() {
		return drink;
	}

	public String getMain() {
		return main;
	}

	public String getSide() {
		return side;
	}

	public String getDessert() {
		return dessert;
	}

	public String getToy() {
		return gift;
	}


	@Override
	public String toString() {
		return "Combo [drink=" + drink + ", main=" + main + ", side=" 
				+ side + ", dessert=" + dessert + ", gift=" + gift + "]";
	}

	public static class Builder {
		private String side;
		private String drink;
		private String main;
		private String dessert;
		private String gift;

		public Builder addSide(String side) {
			this.side = side;
			return this;
		}

		public Builder addDrink(String drink) {
			this.drink = drink;
			return this;

		}

		public Builder addMain(String main) {
			this.main = main;
			return this;
		}

		public Builder addDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public Builder addGift(String gift) {
			this.gift = gift;
			return this;
		}

		public FastFoodMeal getMeal(){
			return new FastFoodMeal(this.drink, this.main, this.side, this.dessert, this.gift);
		}
	}
}
