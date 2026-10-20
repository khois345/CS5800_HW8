import channel.*;
import payment.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashPaymentTest {
	@Test
	public void getMessageAsksForCashAmount() {
		CashPayment notification = new CashPayment(new SmsChannel(), "Chloe", 18.75);

		assertEquals("Hello Chloe, please have $18.75 in cash ready when your order is delivered.", notification.getMessage());
	}
}
