package Ques1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int elem = sc.nextInt();
		
		int [] arr = new int[elem];
		for(int i=0;i<elem;i++) {
			System.out.println("Enter the elements in the array");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int res = sc.nextInt();
		
		try {
			System.out.println("The array element at index " + res+ "="+arr[res]);
			System.out.println("The array element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException b){
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch (NumberFormatException n){
			System.out.println("java.lang.NumberFormatException");
		}
	}
   
}
