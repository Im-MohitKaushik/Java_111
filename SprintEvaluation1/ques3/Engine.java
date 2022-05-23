package SprintEvaluation1.ques3;

public class Engine {

    int rmp;
    int power;
    String manufacturer;
    Boolean hasTurbo;

    public void hasTurbo(boolean b) {
        System.out.println( "Car Has Turbo : "+b);

    }

    public void power(int i) {
        System.out.println("Car power: " +i);
    }

    public void manufacturer(String tata) {
        System.out.println("Car Engine Manufacture: "+ tata);
    }

}