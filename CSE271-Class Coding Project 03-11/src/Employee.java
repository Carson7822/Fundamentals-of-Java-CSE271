
public class Employee extends Person {
    String employeeId;
    public Employee(String passedName, int passedAge, String passedEmployeeId) {
        super(passedName, passedAge);
        employeeId = passedEmployeeId;
    }
    
    public void displayInfo() {
        System.out.println("Employee Info:");
        System.out.println("Name: " + name + ", Age: " + age );
        System.out.println("Employee ID: " + employeeId);
    }
}
