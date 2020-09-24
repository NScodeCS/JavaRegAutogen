package Emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultpasswordlenght = 10;
	private String alternateEmail;
	private String email;
	public String inputlastname;
	public String inputfirstname;
	
	//Build COnstructor for inputs
	public Email(String firstname,String lastname) {
		//get firstname and lastname for EmailApp
		//this.firstName = firstname;
		this.lastName = setlastname();
		this.firstName = setfirstname();
		
		//call method to get the department
		this.department = setDepartment();
		
		//call method for random password
		this.password = randomPassword(defaultpasswordlenght);
		System.out.println("The name you enter is "+this.firstName +" and the department is "+this.department +"The password is \n " +this.password);
		
		//generate the email
		email = this.firstName.toLowerCase() + "."+ this.lastName.toLowerCase()+ "@" + this.department + ".com";
		System.out.println("Your email its " +email);
	}
	
	
	
	private String setDepartment() {
		System.out.println("Enter the department \n 1 For Sales \n 2 For Development \n 3 For Accounting ");
		Scanner input = new Scanner(System.in);
		int Choice = input.nextInt();
		if (Choice == 1) {
			return "sales";
		}else if(Choice == 2) {
			return "Development";
		}else if(Choice == 3) {
			return "Accounting";
		}else {
			return" ";
		}
	}
	//Ask for department
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPRQSTUWXYZ0123456789/*-+";
		char[] password = new char [length];
		for (int i = 0; i<length; i++) {
			
		int random = (int) (Math.random() * passwordSet.length());
			password [i] = passwordSet.charAt(random);
		}
 		return new String (password);
	}
	
	public void SetMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	public String setfirstname() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name");
		inputfirstname = input.nextLine();
		return inputfirstname;
	}
	public String setlastname() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name");
		inputlastname = input.nextLine();
		return inputlastname;
	}
	
	public int getMailboxCapacity(){return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail; }
	public String getPassword() {return password;}
		
	}
	

