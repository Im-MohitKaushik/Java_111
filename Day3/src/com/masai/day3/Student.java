package com.masai.day3;

public class Student {
//	static int roll;
	int roll;
	String name;
	int marks;
	
public static void main(String[] args) { 
// Directly
//	 System.out.println(roll); 
	
//	By class
//	System.out.println(Student.roll);
//	By object
	Student s1 = new Student();
	s1.marks=1000;
	s1.name="Aman";
	s1.roll=26;

	Student s2 = new Student();
	s2.marks=100;
	s2.name="Abhishek";
	s2.roll=27;

	s1.displayStudentDetails(s1.roll, s1.name, s1.marks);
	s2.displayStudentDetails(s2.roll, s2.name, s2.marks);
}
	public void displayStudentDetails(int roll,String name,int marks) {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		System.out.println("=========================");
		
}

}
