
public class Car {
	//instance variables
	
	String make;
	
	String model;
	
	int year;
	
	
	//Default constructor
	public Car() {
		displayNoDetail();
		
	}
	
	//Parameterized Constructor
	public Car(String passedMake, String passedModel, int passedYear) {
		
		make = passedMake;
		
		model = passedModel;
		
		year = passedYear;
		
		displayDetail();
	}
	
	public void start() {
		
		
		System.out.println("Starting....");
	}
	
	public void move() {
		
		System.out.println("Moving....");
	}
	
	public void stop() {
		
		System.out.println("Stopping...");
	}
	
	public void displayNoDetail() {
		System.out.println("An object from the class Car, just created");
		
		System.out.println("No value for instance variables.");
		
	}
	
	public void displayDetail() {
		
		System.out.println("Make: " + make + ", Model: " + model + "and year: " + year);
		
	}
	
	
}
