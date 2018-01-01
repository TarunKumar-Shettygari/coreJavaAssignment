package com.accolite.au;

public class Contact {
	private String name;
	private String number;
	Contact(String name,String number){
		this.name=name;
		this.number=number;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public Boolean equals(Contact c)
	{
		if(this.name==c.name && this.number==c.number)
			return true;
		return false;
	}
}
