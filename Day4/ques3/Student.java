package ques3;

public class Student {
	int roll;
	String name;
	String address;
	String collegeName;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	

	public Student(int roll, String name, String address, String collegeName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = collegeName;
	}
	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT==true) {
			Student s1=new Student(12,"ankit","kanpur");
			s1.setCollegeName("NIT");
			return s1;
		}
		else {
			Student s1=new Student(19,"ankur","Delhi","Ahmednagar college");
			return s1;
		}
		
		
	}
}
