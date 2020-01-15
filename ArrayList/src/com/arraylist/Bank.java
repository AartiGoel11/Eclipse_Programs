package com.arraylist;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name=name;
		branches=new ArrayList<>();
	}
	public boolean addBranch(String branchName) {
		if(findBranch(branchName)==null)
		{
			this.branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}

	public boolean addCustomer(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if(branch!=null) {
			return branch.newCustomer(customerName, amount);
		}
		return false;
	}
	private Branch findBranch(String branchName) {

		for(int i=0;i<branches.size();i++) {
			Branch checkedBranch = this.branches.get(i);
			if(this.branches.get(i).getName().equals(branchName))
				return checkedBranch;
		}
		return null;
	}

	public boolean 	addCustomerTransactions(String branchName,String customerName,double amount) {
		Branch branch=findBranch(branchName);
		if(branch!=null) {
			return branch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}

	public boolean listCustomer(String branchName,boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if(branch!=null) {
			System.out.println("Customer Details for branch "+branch.getName());
			ArrayList<Customer> branchCustomer= branch.getCustomer();
			for(int i=0;i<branchCustomer.size();i++)
			{
				Customer branchCustomers = branchCustomer.get(i);
				System.out.println("Customer "+branchCustomers.getName()+"["+i+"]");
				if(showTransactions)
				{
					System.out.println("Transactions..");	
					ArrayList<Double> transactions = branchCustomers.getTransactions();
					for(int j=0;j<transactions.size();j++)
					{
						System.out.println("["+j+"] Amount "+transactions.get(j));
					}
				}
			}
			return true;
			
		}
		else {
		return false; }
	}















}
