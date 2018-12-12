package selenium.automationFramework.constructors;

public class Superclass {

	// Declare Variables

	private String car;
	private String make;
	private String model;
	private int gears;
	private int wheels;
	private int horsepower;

	// Setters & Getters & Constructors
	
	
	public Superclass(String make1) {
		make = make1;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}

	public void setModel(String model) {
		this.model= model;
	}

	public String getModel() {
		return model;
	}

	public void setHorsePower(int horsepower) {
		this.horsepower = horsepower;
	}

	public int getHorsePower() {
		return horsepower;
	}
}
