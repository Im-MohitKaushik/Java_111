package Ques2;

public class Student {
	int studId;
	String studName;
	double examFee;
	
	public void displayDetails() {
		
	}
	public double payFee(double x) {
		System.out.println("exam fees pais is : "+x);
		double x1=examFee-x;
		System.out.println("remaining feees  is "+x1);
		return  x1;
		
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getExamFee() {
		return examFee;
	}
	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
