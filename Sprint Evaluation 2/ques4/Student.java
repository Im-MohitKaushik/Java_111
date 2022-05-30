package ques4;


public class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String gender, Address address) {
		super(name, gender, address);
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String gender, Address address, int studentId, String courseEnrolled, int courseFee) {
		super(name, gender, address);
		this.studentId = studentId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
}
