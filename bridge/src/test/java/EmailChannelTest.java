import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import channel.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailChannelTest {
	@Test
	public void sendEmailMessage() {
		PrintStream out = System.out;
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		try {
			new EmailChannel().send("Hello");
		} finally {
			System.setOut(out);
		}

		assertEquals("Email: Hello", output.toString().trim());
	}
}
