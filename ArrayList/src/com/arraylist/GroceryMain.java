package com.arraylist;

import java.util.Scanner;

public class GroceryMain {
	private static Scanner sc = new Scanner(System.in);
	private static GroceryList list = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice =0;
		printInstructions();
		while(!quit)
		{
			System.out.print("Enter your choice...\n");
			choice=sc.nextInt();
			sc.nextLine();

			switch(choice)
			{
			case 0: printInstructions();
			break;

			case 1: list.printGroceryList();
			break;

			case 2: addItem();
			break;

			case 3: modifyItem();
			break;

			case 4: removeItem();
			break;

			case 5: searchItem();
			break;

			default :
				quit=true;
				break;

			}
		}
	}

	private static void searchItem() {
		System.out.print("Item to search for..");
		String searchItem=sc.nextLine();
		if(list.findItem(searchItem)!=null)
		{
			System.out.print("Found "+searchItem+ " in our grocery list");
		}
		else
			System.out.print(searchItem +" item is not in the grocery list");

	}

	private static void removeItem() {
		System.out.print("Enter the item number to remove..");
		int remove=sc.nextInt();
		list.removeGroceryItem(remove-1);

	}

	private static void modifyItem() {
		System.out.print("Enter the item number..");
		int itemNo=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter replacement item..");
		String newitem= sc.nextLine();
		list.modifyGroceryList(itemNo-1, newitem);
	}

	private static void addItem() {
		System.out.print("Enter the item to add in the grocery list..");
		list.addGroceryItem(sc.nextLine());
	}

	private static void printInstructions() {

		System.out.println("\nPress..");
		System.out.println("\n 0- To print the choice..");
		System.out.println("\n 1- To print the grocery items..");
		System.out.println("\n 2- To add the grocery items..");
		System.out.println("\n 3- To modify the grocery items..");
		System.out.println("\n 4- To remove  the grocery items..");
		System.out.println("\n 5- To search the grocery items..");
		System.out.println("\n 6- To quit the application");
	}

}
