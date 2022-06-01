package Ques1;

public class Main {
	public static void main(String[] args) {
		
		
		Employee e1=new Employee();
		e1.setName("Mohit");
		e1.setPhoneNumber("6306212345");
		e1.setAddress("Haryana");
		e1.setSalary(50000.00);
		System.out.println("EMPLOYEE DETAILS");
		System.out.println("------------------------------------------");
		System.out.println("Employee name - " +e1.getName());
		System.out.println("Employee phone - "+e1.getPhoneNumber());
		System.out.println("Employee address - "+e1.getAddress());
		System.out.println("Employee salary - " + e1.printSalary());
		System.out.println("-------------------------------------------");
		
		Manager m1=new Manager();
		m1.setName("xyz");
		m1.setPhoneNumber("1234554321");
		m1.setAddress("xxxx");
		m1.setSalary(20000.00);
		System.out.println("MANAGER DETAILS");
		System.out.println("------------------------------------------");
		System.out.println("Manager name - " +m1.getName());
		System.out.println("Manager phone - "+m1.getPhoneNumber());
		System.out.println("Manager address - "+m1.getAddress());
		System.out.println("Manager salary - " + m1.printSalary());
		System.out.println("-------------------------------------------");
		
	}
}
