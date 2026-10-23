import food.*;
import topping.*;

public class initOrder {

	public static void main(String[] args) {
		Order order = new Order();
		order.addItem(new Burger());
		order.addItem(new Ketchup(new Fries()));
		order.addItem(new Cheese(new Ketchup(new Burger())));
		order.addItem(new Onions(new Cheese(new Ketchup(new HotDog()))));

		order.print();
		System.out.println();

		LoyaltyStatus[] statuses = {
			new LoyaltyStatus("Guest"),
			new LoyaltyStatus("Member"),
			new LoyaltyStatus("Regular"),
			new LoyaltyStatus("VIP")
		};

		System.out.println("Show Loyalty discounts:");
		for (int i = 0; i < statuses.length; i++) {
			LoyaltyStatus loyaltyStatus = statuses[i];
			System.out.println("  " + (i + 1) + ". " + loyaltyStatus.getStatus() + " ("
				+ String.format("%.0f%%", loyaltyStatus.getDiscountRate() * 100) + " off): "
				+ String.format("$%.2f", loyaltyStatus.applyDiscount(order.getTotalCost())));
		}
	}
}
