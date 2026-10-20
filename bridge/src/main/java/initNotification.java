import channel.*;
import payment.*;

public class initNotification {

	public static void main(String[] args) {
		NotificationChannel email = new EmailChannel();
		NotificationChannel sms = new SmsChannel();

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
	}
}
