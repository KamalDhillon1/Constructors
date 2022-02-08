package ConstructorPractice;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Here we are writing two lines of code.
		Account obj1 = new Account("Kamal");
		obj1.setAccountName("Kamal");
		System.out.println("Account Name 1:" + obj1.accountName);

//To avoid two lines of codes, will use parametrized constructor
		Account obj2 = new Account("Kaur");
		System.out.println("Account Name 2:" + obj2.accountName);

		// Using more than 1 parametre to write code in one line
		Account obj3 = new Account("Dhillon", "454545454545");
		System.out.println("Account Name 3:" + obj3.accountName);
		System.out.println("Account Number 3:" + obj3.accountNumber);
	}

}
