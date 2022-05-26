package ques1;

import java.util.Scanner;

public class Main {
  public static String reversString(String input){
	  char[] arr = new char[input.length()];
		for(int j=input.length()-1,i=0;i<input.length()&&j>=0;i++,j--) {
			arr[i]=input.charAt(j);	
		}
		
		
		
		return String.valueOf(arr) ;
  }
  
  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		
		String result = Main.reversString(orignalString);
		
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
}
}
