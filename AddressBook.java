package com.bridgelabz.AddressBookSystem;

import java.util.Scanner;

public class AddressBook {
	private String firstName;
    private  String lastName ;
    private  String city;
    private String state;
    private  String pin;
    private  String mobileNumber;
    private String email;
	
	//UC2-method to add contact details
	public void addContact()
	   {

	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter the first name :");
	       String firstName = scanner.nextLine();
	       System.out.println("Enter the last name :");
	       String lastName = scanner.nextLine();
	       System.out.println("Enter the city name :");
	       String city = scanner.nextLine();
	       System.out.println("Enter the state :");
	       String state = scanner.nextLine();
	       System.out.println("Enter the Zip code :");
	       String pin = scanner.nextLine();
	       System.out.println("Enter the Mobile number :");
	       String mobileNumber = scanner.nextLine();
	       System.out.println("email");
	       String email = scanner.nextLine();
	       ContactList contactList = new ContactList(firstName,lastName,city,state,pin,mobileNumber,email);
	       System.out.println("\n"+contactList);
	       

	       
	    }


}
