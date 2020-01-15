package com.arraylist;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<String> grocery = new ArrayList<>();
	
	public void addGroceryItem(String item)
	{
		grocery.add(item);
	}
	
	public void printGroceryList()
	{ System.out.println("You have "+grocery.size()+" items in your grocery list");
	for(int i=0;i<grocery.size();i++)
	{
		System.out.println((i+1) +"."+grocery.get(i));
	}}
		
	public void modifyGroceryList(int position, String item)
	{
		grocery.set(position, item);
		System.out.println("Item "+(position+1)+" has been modified");
	}
	
	public void removeGroceryItem(int position)
	{
		String item =grocery.get(position);
		    grocery.remove(position);
		System.out.println(item + "has been removed from the grocery list");
	}
	
	public String findItem(String search) {
		boolean b = grocery.contains(search);
		int position= grocery.indexOf(search);
		if(position>=0)
		{
			return grocery.get(position);
		
		}
		else
			return null;
	}

	
}
