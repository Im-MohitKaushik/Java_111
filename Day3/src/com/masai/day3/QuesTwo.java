package com.masai.day3;

public class QuesTwo {
public static void main(String[] args) {
	boolean isSnowing = true;
	boolean isRaining = true;
	double temperature = 60.0;	
	checkWeather(isSnowing,isRaining,temperature);
}
static void checkWeather(boolean isSnowing,boolean isRaining,double temperature) {
	if(isRaining&&isSnowing &&temperature <50.0) {
		System.out.println("Let's stay home");
	}
	else {
		System.out.println("Let's go out");
	}
}
}
