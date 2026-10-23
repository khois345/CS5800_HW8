import food.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotDogTest {
	@Test
	public void getDescriptionReturnsName() {
		assertEquals("Hot Dog", new HotDog().getDescription());
	}

	@Test
	public void getCostReturnsBasePrice() {
		assertEquals(2.89, new HotDog().getCost(), 0.001);
	}
}
