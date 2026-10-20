package payment;

import channel.*;

public abstract class PaymentNotification {
	private NotificationChannel channel;	// aggregation
	private String customerName;
	private double amount;

	public PaymentNotification(NotificationChannel channel, String customerName, double amount) {
		setChannel(channel);
		setCustomerName(customerName);
		setAmount(amount);
	}

	public NotificationChannel getChannel() {
		return channel;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setChannel(NotificationChannel channel) {
		if (channel == null) {
			System.err.println("Notification channel cannot be empty");
			return;
		}

		this.channel = channel;
	}

	public void setCustomerName(String customerName) {
		if (customerName == null || customerName.isEmpty()) {
			System.err.println("Customer name cannot be blank");
			return;
		}

		this.customerName = customerName;
	}

	public void setAmount(double amount) {
		if (amount <= 0) {
			System.err.println("Payment amount must be greater than 0");
			return;
		}

		this.amount = amount;
	}
	
	
	// other methods
	public abstract String getMessage();

	public void sendNotification() {
		if (channel == null || customerName == null || amount <= 0) {
			System.err.println("Cannot send a notification without a customer name, payment amount, and a channel");
			return;
		}

		channel.send(getMessage());
	}

	protected String formatAmount() {
		return String.format("$%.2f", amount);
	}
}
