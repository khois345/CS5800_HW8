import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import channel.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmsChannelTest {
	@Test
	public void sendSmsMessage() {
		PrintStream out = System.out;
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		try {
			new SmsChannel().send("Hello");
		} finally {
			System.setOut(out);
		}

		assertEquals("SMS: Hello", output.toString().trim());
	}
}
