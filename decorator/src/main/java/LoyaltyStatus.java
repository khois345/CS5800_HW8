public class LoyaltyStatus {
	private static final String[] STATUSES = {
		"Guest",
		"Member",
		"Regular",
		"VIP"
	};
	private String status;

	public LoyaltyStatus(String status) {
		setStatus(status);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status != null) {
			for (String s : STATUSES) {
				if (s.equalsIgnoreCase(status)) {
					this.status = s;
					return;
				}
			}
		}

		System.err.println("Loyalty status must be either Guest, Member, Regular or VIP");
	}

	public double getDiscountRate() {
		if (status == null) {
			return 0;
		}

		return switch (status) {
			case "Member" -> 0.05;
			case "Regular" -> 0.10;
			case "VIP" -> 0.15;
			default -> 0;
		};
	}

	public double applyDiscount(double total) {
		return total - (total * getDiscountRate());
	}
}
