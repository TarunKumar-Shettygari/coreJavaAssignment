package com.accolite.au;

import java.util.Scanner;

public class Telephone {
	static Scanner s=new Scanner(System.in);
	public static void menu() {
		System.out.println("1.Dial number");
		System.out.println("2.Display contacts");
		System.out.println("3.Add contact");
		System.out.println("4.Delete contact");
		System.out.println("5.Search contacts");
		System.out.println("6.Call contact");
		System.out.println("7.Call history");
		
	}
	public static void main(String[] args) {
		int option;
		Operation op=new Operation();
		menu();
		while(true) {
			System.out.print("enter option:");
			option=s.nextInt();
			switch(option) {
			case 1:op.dial();
				break;
			case 2:op.getContacts().displayContacts();
				break;
			case 3:op.getContacts().addContact();
				break;
			case 4:op.getContacts().deleteContact();
				break;
			case 5:op.getContacts().searchContact();
				break;
			case 6:op.call();
				break;
			case 7:op.callHistory();
				break;
			default:System.out.println("Invalid option.");
			}	
		}			
	}
}
