import food.*;
import topping.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OnionsTest {
	@Test
	public void getNameReturnsOnions() {
		assertEquals("Onions", new Onions(new Burger()).getName());
	}

	@Test
	public void getPriceReturnsToppingPrice() {
		assertEquals(0.50, new Onions(new Burger()).getPrice(), 0.001);
	}
}
