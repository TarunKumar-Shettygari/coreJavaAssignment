package com.accolite.au;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
	private List<Contact> contacts=new ArrayList<Contact>();
	private Scanner s=new Scanner(System.in);
	public void addContact(){
		System.out.print("Enter name: ");
		String name=s.nextLine();
		System.out.print("Enter number: ");
		String number=s.nextLine();
		if(contactExist(name)) {
			System.out.println("Do you want to replace existing contact(yes/no):");
			String temp=s.nextLine();
			if(temp=="no") {
				return;
			}
		}
		if(number.length()!=10)
		{
			System.out.println("invalid number.");
			return;
		}
		try {
			Long.parseLong(number);
		}
		catch(Exception e) {
			System.out.println("invalid number.");
		}
		Contact c=new Contact(name,number);
		contacts.add(c);
		System.out.println("Contact added successfully");
	}
	public void displayContacts() {
		for(Contact c:contacts) {
			System.out.println("name: "+c.getName()+"   number: "+c.getNumber());
		}
	}
	public void searchContact() {
		System.out.print("Enter name: ");
		String name=s.nextLine();
		for(Contact c:contacts) {
			if(c.getName().equals(name)) {
				System.out.println("name: "+c.getName()+"   number: "+c.getNumber());
				return;
			}
		}
		System.out.println("Contact not found.");
	}
	public void deleteContact() {
		System.out.print("Enter name: ");
		String name=s.nextLine();
		for(Contact c:contacts) {
			if(c.getName().equals(name)) {
				contacts.remove(c);
				System.out.println("contact delected");
				return;
			}
		}
		System.out.println("Contact not found.");
	}
	public Boolean contactExist(String name) {
		for(Contact c:contacts) {
			if(c.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

}
