package ConstructorPractice;

public class Account {

	String accountName;
	String accountNumber;
	//Constructor is something run behind the scene.
	//Constructor have same name as class.
	//It has no return type
	//Java provides default constructor if one does not exist.


//no arg constructor, Default constructor
	Account() {
		
	}

//Parametrized Constructor-here we taking input argument 
	// and assigning value to class variable
	Account(String acctName) {
		accountName = acctName;

	}

//More than one parameter-works like setter method
	Account(String acctName, String acctNumber) {
		accountName = acctName;
		accountNumber = acctNumber;
	}

	// using as example to explain for obj1
	void setAccountName(String acctName) {
		accountName = acctName;
	}

}
