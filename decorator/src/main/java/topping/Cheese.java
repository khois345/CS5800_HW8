package topping;

import food.*;

public class Cheese extends ToppingDecorator {
	private static final double PRICE = 0.75;

	public Cheese(FoodItem foodItem) {
		super(foodItem);
	}

	@Override
	public String getName() {
		return "Cheese";
	}

	@Override
	public double getPrice() {
		return PRICE;
	}
}
