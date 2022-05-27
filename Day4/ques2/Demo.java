package ques2;

public class Demo {
	public Demo() {
		new Demo("s");
		System.out.println("inside cons1");
	}
	public Demo(String s) {
		new Demo(10);
		System.out.println("inside cons2");
	}
	public Demo(int i) {
		new Demo(125f);
		System.out.println("inside cons3");
	}
	public Demo(float f) {
		System.out.println("inside cons4");
	}
	
	public static void main(String[] args) {
		new Demo();
		
	}
}
