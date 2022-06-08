package Ques1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		if(amount > 1000) {
			return new TajHotel();
		}
		else if(amount > 200 && amount <1000) {
			return new RoadSideHotel();
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Amount : ");
		int res = sc.nextInt();
		
		Demo d1 = new Demo();
		Hotel h1 = d1.provideFood(res);
		
		if(h1 instanceof TajHotel) {
			h1.chickenBiryani();
			h1.masalaDosa();
			((TajHotel) h1).welcomeDrink();
		}
		else if(h1 instanceof RoadSideHotel) {
			h1.chickenBiryani();
			h1.masalaDosa();
		}
		else {
			System.out.println("Please ebter valid amount");
		}
	}
}
