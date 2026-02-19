package Vehicles;

public class Truck extends Vehicles{
    double cargoCapacity;
    
    public Truck(String passedMake, String passedModel, int passedYear, double passedCargoCapacity) {
        super(passedMake, passedModel, passedYear);
        setCargoCapacity(passedCargoCapacity);
    }
    
    public double getCargoCapacity() {
        return cargoCapacity;
    }
    
    public void setCargoCapacity(double passedCargoCapacity) {
        if (passedCargoCapacity >= 0) {
            cargoCapacity = passedCargoCapacity;
        } else {
            System.out.println("Cargo capacity must be positive.");
        }
    }
}
