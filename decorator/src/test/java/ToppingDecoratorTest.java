import food.*;
import topping.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToppingDecoratorTest {
	@Test
	public void getFoodItemReturnsWrappedItem() {
		FoodItem burger = new Burger();

		assertSame(burger, new Ketchup(burger).getFoodItem());
	}

	@Test
	public void getDescriptionAddsEachTopping() {
		FoodItem hotDog = new Onions(new Cheese(new Ketchup(new HotDog())));

		assertEquals("Hot Dog + Ketchup + Cheese + Onions", hotDog.getDescription());
	}

	@Test
	public void getCostAddsEachToppingPrice() {
		FoodItem hotDog = new Onions(new Cheese(new Ketchup(new HotDog())));

		assertEquals(2.89 + 0.25 + 0.75 + 0.50, hotDog.getCost(), 0.001);
	}
}
