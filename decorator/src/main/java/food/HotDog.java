package food;

public class HotDog implements FoodItem {
	private static final double PRICE = 2.89;

	@Override
	public String getDescription() {
//		return "Hot Dog";
		return null;
	}

	@Override
	public double getCost() {
//		return PRICE;
		return 0;
	}
}
