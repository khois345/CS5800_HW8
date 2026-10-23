import food.*;
import topping.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KetchupTest {
	@Test
	public void getNameReturnsKetchup() {
		assertEquals("Ketchup", new Ketchup(new Burger()).getName());
	}

	@Test
	public void getPriceReturnsToppingPrice() {
		assertEquals(0.25, new Ketchup(new Burger()).getPrice(), 0.001);
	}
}
