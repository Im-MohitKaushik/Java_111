package SprintEvaluation1.ques3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Harrier");
        car.setComapnyName("Tata");
        car.setColor("black");

        Engine engine = new Engine();
        engine.hasTurbo(true);
        engine.power(110);
        engine.manufacturer("tata");

        System.out.println(car.getColor());
        System.out.println(car.getComapnyName());
        System.out.println(car.getModel());
    }
}