import channel.*;
import payment.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OnlinePaymentNotificationTest {
	@Test
	public void setPaymentMethodIgnoresCase() {
		OnlinePaymentNotification notification = new OnlinePaymentNotification(new EmailChannel(), "Khoi", 59.99, "paypal");

		assertEquals("PayPal", notification.getPaymentMethod());
	}

	@Test
	public void getMessageIncludesAmountAndMethod() {
		OnlinePaymentNotification notification = new OnlinePaymentNotification(new EmailChannel(), "Khoi", 59.99, "Credit Card");

		assertEquals("Hello Khoi, your online payment of $59.99 paid via Credit Card was successful.", notification.getMessage());
	}
}
