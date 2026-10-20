import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import channel.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PushChannelTest {
	@Test
	public void sendPushMessage() {
		PrintStream out = System.out;
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		try {
			new PushChannel().send("Hello");
		} finally {
			System.setOut(out);
		}

		assertEquals("Push: Hello", output.toString().trim());
	}
}
