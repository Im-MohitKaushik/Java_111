package ques2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Number of students: ");
     int tc = sc.nextInt();
     int sum = 0;
     Student s1 = new Student();
     for(int i=0;i<tc;i++) {
    	 System.out.println("Enter name of student "+ (i+1));
    	 String name = sc.next();
    	 s1.setName(name);
    	 
    	 System.out.println("Enter roll number of Student : "+(i+1));
    	 int roll = sc.nextInt();
    	 s1.setRoll(roll);

    	 System.out.println("Enter marks of student "+ (i+1));
    	 int marks = sc.nextInt();
    	 s1.setMarks(marks);
    	 
    	 
    	 sum+= marks;
    	 
     }
     System.out.println("Name of the student : "+ s1.getName() );
     System.out.println("Roll of the student : "+ s1.getRoll());
     System.out.println("Marks of the student : " + s1.getMarks());
     System.out.println("========================================");
     System.out.println("Average marks of all the students is : " + (sum/tc));
	}

}
