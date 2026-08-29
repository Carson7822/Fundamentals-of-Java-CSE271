package Vehicles;

public class Vehicles {
    
    String make;
    String model;
    int year;
    double speed;
    
    public Vehicles(String passedMake, String passedModel, int passedYear) {
        speed = 0;
        setMake(passedMake);
        setModel(passedModel);
        setYear(passedYear);
        setSpeed(speed);
    }
    
    public void setMake(String passedMake) {
        make = passedMake;
    }
    
    public void setModel(String passedModel) {
        model = passedModel;
    }
    
    public void setYear(int passedYear) {
        year = passedYear;
    }
    
    public void setSpeed(double passedSpeed) {
        if (passedSpeed >= 0) {
            speed = passedSpeed;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }
    
    public String getMake() {
        return make;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getSpeed() {
        return speed;
    }
    public String getModel() {
        return model;
    }
    
    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Speed: " + speed + " km/h");
    }
}
