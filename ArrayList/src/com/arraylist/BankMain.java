package com.arraylist;

public class BankMain {
	public static void main(String[] args) {
		Bank bank = new Bank("National Australia Bank");
		bank.addBranch("India");
		
		bank.addCustomer("India", "Aarti", 90.89);
		bank.addCustomer("India", "Shubham", 190.89);
		bank.addCustomer("India", "Onkar", 178.89);
		bank.addCustomer("India", "Sushma", 190.89);
		
		bank.addBranch("Sydeny");
		bank.addCustomer("Sydeny", "Pooja", 77.56);
		
		bank.addCustomerTransactions("India", "Aarti", 56.67);
		bank.addCustomerTransactions("Sydeny", "Pooja", 100.67);
		bank.addCustomerTransactions("India", "Onkar", 16.67);
		
		bank.listCustomer("India", false);


	}

}
