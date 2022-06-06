package Ques3;

import java.util.Scanner;

public class Demo {

public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	System.out.println("Enter month");
	String res = sc.next();
//		Month m1 = Month.res;
		
		switch(res) {
		case jan:
			System.out.println("This is the 1st Month of the Year January");
			break;
		case feb:
			System.out.println("This is the 2nd Month of the Year February");
			break;
		case march:
			System.out.println("This is the 3rd Month of the Year March");
			break;	
		case april:
			System.out.println("This is the 4th Month of the Year April");
			break;
		case may:
			System.out.println("This is the 5th Month of the Year May");
			break;
		case june:
			System.out.println("This is the 6th Month of the Year June");
			break;
		case july:
			System.out.println("This is the 7th Month of the Year July");
			break;
		case aug:
			System.out.println("This is the 8th Month of the Year August");
			break;
		case sep:
			System.out.println("This is the 9th Month of the Year September");
			break;
		case oct:
			System.out.println("This is the 10th Month of the Year August");
			break;
		case nov:
			System.out.println("This is the 11th Month of the Year November");
			break;
		case dec:
			System.out.println("This is the 12th Month of the Year December");
			break;
		default:
			System.out.println("Enter valid month");
			break;
		}
}
}