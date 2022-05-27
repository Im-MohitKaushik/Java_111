package ques1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1 = new Student();
       
       System.out.println("Without param cons");
       s1.setName("Mohit");
       s1.setRoll(12);
       s1.setAge(22);
       s1.setMarks(499);
       System.out.println("=========================");
       System.out.println(s1.getName());
       System.out.println(s1.getAge());
       System.out.println(s1.getMarks());
       System.out.println(s1.getRoll());
       
       Student s2 = new Student(22,"Aman",23,450);
       
       System.out.println("=========================");
       System.out.println("With param cons");
       System.out.println("=========================");
       System.out.println(s2.getName());
       System.out.println(s2.getAge());
       System.out.println(s2.getMarks());
       System.out.println(s2.getRoll());
       
	}

}
