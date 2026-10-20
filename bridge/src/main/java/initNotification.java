import channel.*;
import payment.*;

public class initNotification {

	public static void main(String[] args) {
		NotificationChannel email = new EmailChannel();
		NotificationChannel sms = new SmsChannel();
		NotificationChannel push = new PushChannel();

		// Part 1
		PaymentNotification[] partOneNotifications = {
			new OnlinePaymentNotification(email, "Khoi", 59.99, "Credit Card"),
			new OnlinePaymentNotification(sms, "Emily", 119.49, "PayPal"),
			new CashPayment(email, "Tam", 35.00),
			new CashPayment(sms, "Chloe", 18.75)
		};

		for (PaymentNotification notification : partOneNotifications) {
			notification.sendNotification();
			System.out.println();
		}

		// Part 2
		PaymentNotification[] partTwoNotifications = {
			new BitcoinPayment(email, "George", 250.00, "1234556"),
			new BitcoinPayment(sms, "Sophie", 75.00, "12456778")
		};

		for (PaymentNotification notification : partTwoNotifications) {
			notification.sendNotification();
			System.out.println();
		}
	}
}
