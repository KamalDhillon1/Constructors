package Assignment;

public class Product {

	String productName;
	double unitPrice;
	int quantity;
	String promoCode = "";
	double totalPrice;
	

	public Product(String productName, double unitPrice) {

		this.productName = productName;
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	double calculateTotalPrice(double quantity) {
		totalPrice = (unitPrice * quantity);
		System.out.println("The total price before discount is:" + totalPrice);
	return totalPrice;
	}

	void applyDiscount(double totalPrice, String promoCode) {
		if (promoCode.equals("save10")) {
			double discountedPrice = (totalPrice - 10);
			System.out.println("Coupon code applied:" + discountedPrice);

		} else if (totalPrice >= 50) {
			double discountedPrice = totalPrice - (totalPrice * 0.10);
			System.out.println("customer will get 10% discount: " + discountedPrice);

		} else
			System.out.println("Not eligible for either:" + totalPrice);

	}
}
