package Assignment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Product purse = new Product("purse", 10);// Using constructor for product &unit price

		System.out.println("Enter total no. of quantity who wants to purchase");
		purse.setQuantity(sc.nextInt());
		// System.out.println(purse.getQuantity());

       //calling method to calculateTotalPrice
		double PursePrice = purse.calculateTotalPrice(purse.getQuantity());
		System.out.println("Original price for Purse before any discount" + PursePrice);

		// calling apply discount method
		System.out.println("Do you have any promoCode, Please enter if yes");
		String PromoCode = sc.next();
		purse.applyDiscount(PursePrice, PromoCode);
		
	}

}
