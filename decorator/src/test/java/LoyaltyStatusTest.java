import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoyaltyStatusTest {
	@Test
	public void setStatusIgnoresCase() {
		assertEquals("Regular", new LoyaltyStatus("rEGULAR").getStatus());
	}

	@Test
	public void getDiscountRateMatchesStatus() {
		assertEquals(0, new LoyaltyStatus("Guest").getDiscountRate());
		assertEquals(0.05, new LoyaltyStatus("Member").getDiscountRate());
		assertEquals(0.10, new LoyaltyStatus("Regular").getDiscountRate());
		assertEquals(0.15, new LoyaltyStatus("VIP").getDiscountRate());
	}

	@Test
	public void applyDiscountTakesRateOffTotal() {
		assertEquals(90.00, new LoyaltyStatus("Regular").applyDiscount(100.00), 0.001);
	}
}
