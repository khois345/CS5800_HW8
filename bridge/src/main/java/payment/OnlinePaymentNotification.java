package payment;

import channel.*;

public class OnlinePaymentNotification extends PaymentNotification {
	private static final String[] PAYMENT_METHODS = {
		"Credit Card",
		"PayPal"
	};

	private String paymentMethod;

	public OnlinePaymentNotification(NotificationChannel channel, String customerName, double amount, String paymentMethod) {
		super(channel, customerName, amount);
		setPaymentMethod(paymentMethod);
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		if (paymentMethod != null) {
			for (String method : PAYMENT_METHODS) {
				if (method.equalsIgnoreCase(paymentMethod)) {
					this.paymentMethod = method;
					return;
				}
			}
		}

		System.err.println("Online payment method must be either Credit Card or PayPal");
	}

	@Override
	public String getMessage() {
		return "Hello " + getCustomerName() + ", your online payment of " + formatAmount()
			+ " paid via " + paymentMethod + " was successful.";
	}
}
