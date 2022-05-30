package ques3;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
         
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of Passenger: ");
         int numberOfPassenger = sc.nextInt();
         
         System.out.println("Enter the number of Kms: ");
         int numberOfKms = sc.nextInt();
		//Write logic to get numberOfPassenger and numberOfKms

		OLA myOla = new OLA();
		myOla.bookCar(numberOfPassenger, numberOfKms);
		myOla.calculateBill();
//		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is"+ res);
	}
	
}
