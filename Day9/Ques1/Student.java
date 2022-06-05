package Ques1;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grades;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrades() {
		return grades;
	}
	public void setGrades(char grades) {
		this.grades = grades;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, int marks, char grades) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grades = grades;
	}
	
	public void displayDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll of Student : ");
		int roll = sc.nextInt();
		System.out.println("Enter name of student : ");
		String name = sc.next();
		System.out.println("Enter marks of the Student");
		int marks = sc.nextInt();
		char grade = calculateGrade(marks);
		
		Student s1 = new Student(roll,name,marks,grade);
		System.out.println(s1.toString());
	}
	private char calculateGrade(int marks) {
		if(marks >= 500) {
			return 'A';
		}
		else if(marks < 500 && marks >=400) {
			return 'B';
		}
		else if(marks < 400 && marks >0) {
			return 'C';
		}
		else {
			System.out.println("Enter valid Marks");
			return 'X';
		}
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grades=" + grades + "]";
	}
	
}
