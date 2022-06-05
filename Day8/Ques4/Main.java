package Ques4;

public class Main {
	public static void main(String[] args) {
		Animal [] animal = new Animal[3];
		
		animal[2] = new Tiger();
		animal[0] = new Dog();
		animal[1] = new Cat();
		
		for(int i=0;i<animal.length;i++) {
			animal[i].eat();
			animal[i].walk();
			animal[i].makeNoise();
			System.out.println("==========================");
		}
	}
}
