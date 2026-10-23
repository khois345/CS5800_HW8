package topping;

import food.*;

public class Onions extends ToppingDecorator {
	private static final double PRICE = 0.50;

	public Onions(FoodItem foodItem) {
		super(foodItem);
	}

	@Override
	public String getName() {
//		return "Onions";
		return null;
	}

	@Override
	public double getPrice() {
//		return PRICE;
		return 0;
	}
}
