package Singleton;

import java.util.ArrayList;

public class ContactList {
	
	private static ContactList instance;
	
	//Fields
	private String listName;
	private ArrayList<Contact> contacts;
	
	//Default constructor - singleton constructors are always private
	private ContactList() {
		this.listName = "My Contacts";
		this.contacts = new ArrayList<Contact>();
	}
	

	//See if an instance exists - if not, then create it.
	public static ContactList getInstance() {
		if (instance == null) {
			instance = new ContactList();
		}
		
		return instance;
	}
	
	//Getters and Setters
	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}
	
	public void addContact (Contact newContact) {
		this.contacts.add(newContact);
	}
	
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		for (Contact c : contacts) {
			builder.append(c.toString() + "\n");
		}
		
		return builder.toString();
	}

}
