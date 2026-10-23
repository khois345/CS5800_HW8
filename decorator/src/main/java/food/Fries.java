package food;

public class Fries implements FoodItem {
	private static final double PRICE = 5.67;

	@Override
	public String getDescription() {
//		return "Fries";
		return null;
	}

	@Override
	public double getCost() {
//		return PRICE;
		return 0;
	}
}
