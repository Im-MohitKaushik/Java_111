package SprintEvaluation1.ques3;

public class Car {
	    private String model;
	    private String ComapnyName;
	    private  String color;
	    Engine engine;

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public String getComapnyName() {
	        return ComapnyName;
	    }

	    public void setComapnyName(String comapnyName) {
	        ComapnyName = comapnyName;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public Engine getEngine() {
	        return engine;
	    }

	    public void setEngine(Engine engine) {
	        this.engine = engine;
	    }


	    public Car(String model, String comapnyName, String color, Engine engine) {
	        this.model = model;
	        ComapnyName = comapnyName;
	        this.color = color;
	        this.engine = engine;
	    }

	    public Car() {
	    }
	}