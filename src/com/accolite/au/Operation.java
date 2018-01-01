package com.accolite.au;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class Operation {
	private class Call{
		private String number;
		private String timestamp;
		public String getNumber() {
			return number;
		}
		public String getTimestamp() {
			return timestamp;
		}
	}
	private Scanner s=new Scanner(System.in);
	private List<Call> calls=new ArrayList<Call>();
	private Contacts contacts=new Contacts();
	public Contacts getContacts() {
		return contacts;
	}
	public void call() {
		Call c=new Call();
		System.out.print("Enter contact name: ");
		String name=s.nextLine();
		if(contacts.contactExist(name)) {
			c.number=name;
			c.timestamp=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
			calls.add(c);
			System.out.println("calling...");
		}
		else {
			System.out.println("invalid contact or contact does not exist.");
		}
	}
	public void dial() {
		Call c=new Call();
		System.out.print("Enter number: ");
		String num=s.nextLine();
		if(num.length()!=10)
		{
			System.out.println("invalid number.");
			return;
		}
		try {
			Long.parseLong(num);
			c.number=num;
			c.timestamp=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
			calls.add(c);
			System.out.println("calling...");
		}
		catch(Exception e) {
			System.out.println("invalid number.");
		}
	}
	public void callHistory() {
		System.out.println("\tcall history\t");
		ListIterator<Call> listIterator=calls.listIterator(calls.size());
		while(listIterator.hasPrevious()) {
			Call c=new Call();
			c=listIterator.previous();
			System.out.println(c.getNumber()+"   "+c.getTimestamp());
		}
	}

}
