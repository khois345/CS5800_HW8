package topping;

import food.*;

public abstract class ToppingDecorator implements FoodItem {
	private FoodItem foodItem;	// aggregation

	public ToppingDecorator(FoodItem foodItem) {
		if (foodItem == null) {
			System.err.println("Food item cannot be empty");
			return;
		}

		this.foodItem = foodItem;
	}

	public FoodItem getFoodItem() {
		return foodItem;
	}

	@Override
	public String getDescription() {
		if (foodItem == null) {
			return getName();
		}

		return foodItem.getDescription() + " + " + getName();
	}

	@Override
	public double getCost() {
		if (foodItem == null) {
			return getPrice();
		}

		return foodItem.getCost() + getPrice();
	}

	// other methods
	public abstract String getName();

	public abstract double getPrice();
}
