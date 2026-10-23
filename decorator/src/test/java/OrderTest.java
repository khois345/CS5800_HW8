import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import food.*;
import topping.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
	@Test
	public void addItemRejectsNull() {
		Order order = new Order();
		order.addItem(new Burger());
		order.addItem(null);

		assertEquals(1, order.getItems().size());
	}

	@Test
	public void getTotalCostSumsEachItem() {
		Order order = new Order();
		order.addItem(new Cheese(new Burger()));
		order.addItem(new Fries());

		assertEquals(8.89 + 0.75 + 5.67, order.getTotalCost(), 0.001);
	}

	@Test
	public void printShowsItemsAndTotal() {
		Order order = new Order();
		order.addItem(new Ketchup(new Fries()));

		PrintStream out = System.out;
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		try {
			order.print();
		} finally {
			System.setOut(out);
		}

		String printed = output.toString();
		assertTrue(printed.contains("1. Fries + Ketchup - $5.92"));
		assertTrue(printed.contains("Total: $5.92"));
	}
}
