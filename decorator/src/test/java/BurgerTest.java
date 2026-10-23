import food.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BurgerTest {
	@Test
	public void getDescriptionReturnsName() {
		assertEquals("Burger", new Burger().getDescription());
	}

	@Test
	public void getCostReturnsBasePrice() {
		assertEquals(8.89, new Burger().getCost(), 0.001);
	}
}
