package Ques2;

public class Main {
	public static void main(String[] args) {

		DayScholar d1 = new DayScholar();
		d1.setTransportFee(5000);
		d1.setExamFee(50000 + d1.getTransportFee());		
		d1.setStudId(1);
		d1.setStudName("Mohit");
		
		System.out.println("=============================================");
		System.out.println("student name : "+d1.getStudName());
		System.out.println("student id : "+ d1.getStudId());
		System.out.println("student transport feess : "+ d1.getTransportFee());
		d1.payFee(25000);
		
		DayScholar d2 = new DayScholar();
		d2.setTransportFee(1000);
		d2.setExamFee(60000+ d2.getTransportFee());
		
		d2.setStudId(2);
		d2.setStudName("Aman");
		
		
		System.out.println("=============================================");
		System.out.println("student name : "+ d2.getStudName());
		System.out.println("student id : "+ d2.getStudId());
		System.out.println("student ransport fees : "+ d2.getTransportFee());
		d2.payFee(1000);
		
		
	}
}
