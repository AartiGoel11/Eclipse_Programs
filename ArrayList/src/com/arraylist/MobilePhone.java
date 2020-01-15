package com.arraylist;

import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private  ArrayList<Contact> myContacts;
	public MobilePhone(String myNumber) {
		super();
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact) {
		if(findContact(contact.getName())>=0)
			{System.out.println("Contact is already present in file");
			return false;
			}
		
		myContacts.add(contact);
		return true;
	}
	
	public boolean updateContact(Contact oldNum, Contact newNum)
	{
		int foundPosition = findContact(oldNum);
		if(foundPosition<0)
		{
			System.out.println(oldNum.getName()+" was not in the list");
			return false;
		}
		else
			this.myContacts.set(foundPosition, newNum);
		System.out.println(oldNum.getName()+" is replaced with "+newNum.getName());
			return true;
	}
 public boolean removeContact(Contact contact) {
	 int foundPosition = findContact(contact);
	 if(foundPosition<0)
	 {
		 System.out.println(contact.getName()+" was not found in the list..");
		 return false;
	 }
	 this.myContacts.remove(foundPosition);
	 System.out.println(contact.getName()+" has been removed from the contact list");
	 return true;
 }
	private int findContact(String name) {
		for(int i=0;i<myContacts.size();i++)
		{
		 Contact contact = this.myContacts.get(i);
		 if(contact.getName().equals(name))
			 return i;
		}
		
		return -1;
	}
	
private int findContact(Contact contact) {
		
		return this.myContacts.indexOf(contact);
	}

public  String queryContact(Contact contact) {
	if(findContact(contact)>=0)
	{
		return contact.getName();
	}
	return null;
}

public Contact queryContact(String name) {
	int position = findContact(name);
	if(position>=0)
	{
		return this.myContacts.get(position);
	}
	return null;
}

public void printContact() {
	System.out.println("Contact List..");
	for(int i=0;i<myContacts.size();i++)
	{
		System.out.println((i+1)+". " +this.myContacts.get(i).getName()+
				"-->" + this.myContacts.get(i).getPhoneNumber());
	}
	
}
	

}
