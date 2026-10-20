package payment;

import channel.*;

public class BitcoinPayment extends PaymentNotification {
	private String walletAddress;

	public BitcoinPayment(NotificationChannel channel, String customerName, double amount, String walletAddress) {
		super(channel, customerName, amount);
		setWalletAddress(walletAddress);
	}

	public String getWalletAddress() {
		return walletAddress;
	}

	public void setWalletAddress(String walletAddress) {
		if (walletAddress == null || walletAddress.isEmpty()) {
			System.err.println("Bitcoin wallet address cannot be blank");
			return;
		}

		this.walletAddress = walletAddress;
	}

	@Override
	public String getMessage() {
		return "Hello " + getCustomerName() + ", your Bitcoin payment of " + formatAmount()
			+ " paid from wallet " + walletAddress + " has been confirmed.";
	}
}
