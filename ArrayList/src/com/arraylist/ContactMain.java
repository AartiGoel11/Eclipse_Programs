package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactMain {
 private static Scanner sc = new Scanner(System.in);
 private static MobilePhone mobilePhone = new MobilePhone("0087 464 8838");
	public static void main(String[] args) {
		
    boolean quit= false;
    startPhone();
    printActions();
    while(!quit)
	{ System.out.println("Enter Action : (6 to show available actions.");
	int action = sc.nextInt();
	sc.nextLine();
	switch(action) {
	case 0 : System.out.println("Shutting down..");
	quit =true;
	break;
	case 1: mobilePhone.printContact();
	break;
	case 2: addNewContact();
	break;
	case 3: updateContact();
	break;
	case 4: removeContact();
	break;
	case 5: queryContact();
	break;
	case 6 :printActions();
	break;
	
	}
		
	}
	}
	

	private static void queryContact() {
		System.out.println("Enter the existing contact name..");
		String name = sc.nextLine();
		Contact exitingContact =mobilePhone.queryContact(name);
		if(exitingContact==null)
		{
			System.out.println("Contact is not found..");
			return;
		}
		System.out.println("Name : " +exitingContact.getName() + " phone number is "
		+exitingContact.getPhoneNumber());
	}


	private static void removeContact() {
		System.out.println("Enter the existing contact name..");
		String name = sc.nextLine();
		Contact exitingContact =mobilePhone.queryContact(name);
		if(exitingContact==null)
		{
			System.out.println("Contact is not found..");
			return;
		}
		if(mobilePhone.removeContact(exitingContact))
			System.out.println("successfully deleted..");
		else
			System.out.println("error deleting contact..");
	}


	private static void updateContact() {
		System.out.println("Enter the existing contact name..");
		String name = sc.nextLine();
		Contact exitingContact =mobilePhone.queryContact(name);
		if(exitingContact==null)
		{
			System.out.println("Contact is not found..");
			return;
		}
		System.out.println("Enter new contact name..");
		String newName= sc.nextLine();
		System.out.println("Enter new Contact phone number");
		String number=sc.nextLine();
		Contact newContact = Contact.createContact(newName, number);
		if(mobilePhone.updateContact(exitingContact, newContact))
			System.out.println("successfully updated record..");
		else
			System.out.println("error updating record..");
		
	}


	private static void addNewContact() {
		System.out.println("Enter new Contact name..");
		String name = sc.nextLine();
		System.out.println("Enter new Contact Number..");
		String number=sc.nextLine();
		Contact newContact = Contact.createContact(name, number);
		boolean result = mobilePhone.addNewContact(newContact);
		if(result)
		{
			System.out.println("New contact has been added successfully..Name = "+ name+
					"Phone "+number);
		}
		else
			System.out.println("Can not add " + name + " ,This contact is already present "
					+ "in the contact list..");
	}


	private static void printActions() {
		System.out.println("Starting Phone..");
		
	}
	private static void startPhone() {

		System.out.println("\n Available Actions:\n Press");
		System.out.println("0 - to shut down\n"+
		                   "1 - to print contacts\n"+
				           "2 - to add a new contact\n"+
		                   "3 - to update an existing contact\n"+
				           "4 - to remove an existing contact\n"+
		                   "5-query if an existing contact exists\n"+
				            "6- to print a list of available actions.\n");
		
		System.out.println("Choose your action :");
	}

}
