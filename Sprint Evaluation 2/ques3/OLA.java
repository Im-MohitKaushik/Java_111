package ques3;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKms) {
		if(numberOfPassenger <=3) {
		   HatchBack hb = new HatchBack();
		   return hb;
		}
		else {
			Sedan se = new Sedan();
			return se;
		}
	}
	
	public int calculateBill(Car car) {
		int TotalFare = numberOfKms * farePerKm;
	}
}
