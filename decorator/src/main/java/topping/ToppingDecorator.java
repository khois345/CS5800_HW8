package topping;

import food.*;

public abstract class ToppingDecorator implements FoodItem {
	private FoodItem foodItem;	// aggregation

	public ToppingDecorator(FoodItem foodItem) {
		this.foodItem = foodItem;
	}

	public FoodItem getFoodItem() {
//		return foodItem;
		return null;
	}

	@Override
	public String getDescription() {
//		return foodItem.getDescription() + " + " + getName();
		return null;
	}

	@Override
	public double getCost() {
//		return foodItem.getCost() + getPrice();
		return 0;
	}

	// other methods
	public abstract String getName();

	public abstract double getPrice();
}
