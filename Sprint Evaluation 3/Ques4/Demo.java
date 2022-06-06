package Ques4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		String username = sc.next();
		if(username.length() >3 && username.length()<8) {
			c1.setUsername(username);
		}
		System.out.println("Enter password : ");
		String password = sc.next();
		if(password.length()>3 && password.length()<8) {
			c1.setPassword(password);
		}
		
		System.out.println("Enter mobileNumber: ");
		String mobileNumber = sc.next();
		if((mobileNumber.length()==10) ) {
			c1.setMobileNumber(mobileNumber);
		}
		System.out.println("Enter email : ");
		String email = sc.next();
		
		Customer c2 = new Customer(username,password,mobileNumber,email);
		System.out.println(c2.toString());
	}

}
