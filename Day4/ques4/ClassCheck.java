package ques4;

public class ClassCheck {

	public static void main(String[] args) {
		ClassCheck c1 = new ClassCheck(); 
		c1.checkNum(46);
	}
	
	public void checkNum(int x) {
		if(x<0) {
			System.out.println("Input:"+ x + " ,Output:" + "Error");
		}
		if(x%2 == 1) {
			System.out.println("Input:"+ x + " ,Output:" + x);
		}
		else if(x%2 == 0) {
			int z = x/10;
			System.out.println("Input:"+ x + " ,Output:" + (z+1)*10);
		}
	}
}
