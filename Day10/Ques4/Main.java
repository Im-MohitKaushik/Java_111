package Ques4;

public class Main {
	public static void main(String[] args) {

		Shape s1 = new Area();
		System.out.println("Rectangle area : " + s1.rectangleArea(12, 8));
		System.out.println("Cicle area : " + s1.circleArea(21));
		System.out.println("Square area : " + s1.squareArea(19));
	}
}
