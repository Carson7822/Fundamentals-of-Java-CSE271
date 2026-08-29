package Vehicles;

public class Car extends Vehicles{
    int doors;
    
    public Car(String passedMake, String passedModel, int passedYear, int passedDoors) {
        super(passedMake, passedModel, passedYear);
        setDoors(passedDoors);
    }
    
    public int getDoors(){
        return doors;
    }
    
    public void setDoors(int passedDoors) {
        if (passedDoors >= 0) {
            doors = passedDoors;   
        } else {
            System.out.println("Number of doors must be greater than 0.");
        }
    }
}
