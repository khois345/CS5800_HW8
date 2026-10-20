package payment;

import channel.*;

public class CashPayment extends PaymentNotification {
	public CashPayment(NotificationChannel channel, String customerName, double amount) {
		super(channel, customerName, amount);
	}

	@Override
	public String getMessage() {
		return "Hello " + getCustomerName() + ", please have " + formatAmount()
			+ " in cash ready when your order is delivered.";
	}
}
