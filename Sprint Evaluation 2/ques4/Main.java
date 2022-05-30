package ques4;

public class Main {
	
	public static Person generatePerson(Person person) {
		return person;
	}
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Student("Mohit","Male",new Address("Charkhi dadri","Haryana","127022"),123,"Java",120001));

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
	}
}
