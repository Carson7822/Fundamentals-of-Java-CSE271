package Driver;

import Vehicles.Car;
import Vehicles.Truck;

public class VehicleTest {

    public static void main(String[] args) {
        Car carObject = new Car("Toyota", "Camry", 2022, 4);
        Truck truckObject = new Truck("Ford", "F-150", 2021, 1.5);
        carObject.setSpeed(120);
        truckObject.setSpeed(100);
        System.out.println("Car Info:");
        carObject.displayInfo();
        System.out.println("Truck Info:");
        truckObject.displayInfo();
        
        

    }

}
