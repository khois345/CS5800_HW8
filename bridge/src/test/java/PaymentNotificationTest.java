import java.util.ArrayList;
import java.util.List;

import channel.*;
import payment.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentNotificationTest {
	@Test
	public void setChannelRejectsNull() {
		NotificationChannel email = new EmailChannel();
		PaymentNotification notification = new CashPayment(email, "Khoi", 10.00);
		notification.setChannel(null);

		assertSame(email, notification.getChannel());
	}

	@Test
	public void setCustomerNameRejectsBlank() {
		PaymentNotification notification = new CashPayment(new EmailChannel(), "", 10.00);

		assertNull(notification.getCustomerName());
	}

	@Test
	public void setAmountRejectsZeroOrNegative() {
		PaymentNotification notification = new CashPayment(new EmailChannel(), "Khoi", -5.00);

		assertEquals(0, notification.getAmount());
	}

	@Test
	public void sendNotificationSendsMessageThroughChannel() {
		ArrayList<String> sent = new ArrayList<>();
		PaymentNotification notification = new CashPayment(sent::add, "Khoi", 64.10);
		notification.sendNotification();

		assertEquals(List.of(notification.getMessage()), sent);
	}
}
