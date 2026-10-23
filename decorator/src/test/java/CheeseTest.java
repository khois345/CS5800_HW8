import food.*;
import topping.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheeseTest {
	@Test
	public void getNameReturnsCheese() {
		assertEquals("Cheese", new Cheese(new Burger()).getName());
	}

	@Test
	public void getPriceReturnsToppingPrice() {
		assertEquals(0.75, new Cheese(new Burger()).getPrice(), 0.001);
	}
}
