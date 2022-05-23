package SprintEvaluation1;

import java.util.Scanner;

public class Course {
  int courseId;
  String courseName;
  int courseFee;
  
  public static void authenticate(String username,String password) {
	  if(username == "Admin" && password == "1234") {
		  Course c1 = new Course();
		  c1.displayCourseDetails();
	  }
	  else {
		  System.out.println("Invalid Username or password");
	  }
  }
  
  public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getCourseFee() {
	return courseFee;
}

public void setCourseFee(int courseFee) {
	this.courseFee = courseFee;
}

public void displayCourseDetails() {
	 Course c1 = new Course();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		int password = sc.nextInt();
		
		c1.authenticate("username","password");
		c1.courseId = 1000;
		c1.courseName = "Java";
		c1.courseFee = 6542;
	  System.out.println(courseId);
	  System.out.println(courseName);
	  System.out.println(courseFee);
  }
	public static void main(String[] args) {
		
		authenticate("Admin","1234");
		authenticate("Admidasfcn","12345");
	}

}
