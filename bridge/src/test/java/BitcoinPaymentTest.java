import channel.*;
import payment.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BitcoinPaymentTest {
	@Test
	public void setWalletAddressRejectsBlank() {
		BitcoinPayment notification = new BitcoinPayment(new EmailChannel(), "George", 250.00, "");

		assertNull(notification.getWalletAddress());
	}

	@Test
	public void getMessageIncludesWalletAddress() {
		BitcoinPayment notification = new BitcoinPayment(new EmailChannel(), "George", 250.00, "bc1qabc");

		assertEquals("Hello George, your Bitcoin payment of $250.00 paid from wallet bc1qabc has been confirmed.", notification.getMessage());
	}
}
