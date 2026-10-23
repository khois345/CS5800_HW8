import java.util.ArrayList;

import food.*;

public class Order {
	private ArrayList<FoodItem> items;	// aggregation

	public Order() {
		this.items = new ArrayList<>();
	}

	public ArrayList<FoodItem> getItems() {
		return items;
	}

	public void addItem(FoodItem item) {
//		if (item == null) {
//			System.err.println("Food item cannot be empty");
//			return;
//		}
//
//		items.add(item);
	}

	public double getTotalCost() {
//		double total = 0;
//		for (FoodItem item : items) {
//			total += item.getCost();
//		}
//		return total;
		return 0;
	}

	public void print() {
//		System.out.println("Order:");
//		for (int i = 0; i < items.size(); i++) {
//			FoodItem item = items.get(i);
//			System.out.println("  " + (i + 1) + ". " + item.getDescription() + " - " + String.format("$%.2f", item.getCost()));
//		}
//		System.out.println("Total: " + String.format("$%.2f", getTotalCost()));
	}
}
