package food;

public class Burger implements FoodItem {
	private static final double PRICE = 8.89;

	@Override
	public String getDescription() {
//		return "Burger";
		return null;
	}

	@Override
	public double getCost() {
//		return PRICE;
		return 0;
	}
}
