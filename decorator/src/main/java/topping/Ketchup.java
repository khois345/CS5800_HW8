package topping;

import food.*;

public class Ketchup extends ToppingDecorator {
	private static final double PRICE = 0.25;

	public Ketchup(FoodItem foodItem) {
		super(foodItem);
	}

	@Override
	public String getName() {
		return "Ketchup";
	}

	@Override
	public double getPrice() {
		return PRICE;
	}
}
