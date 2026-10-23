import food.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FriesTest {
	@Test
	public void getDescriptionReturnsName() {
		assertEquals("Fries", new Fries().getDescription());
	}

	@Test
	public void getCostReturnsBasePrice() {
		assertEquals(5.67, new Fries().getCost(), 0.001);
	}
}
