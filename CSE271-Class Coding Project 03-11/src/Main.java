public class Main {

    public static void main(String[] args) {
        Person personClassObject = new Person("John Doe", 30);
        Employee employeeClassObject = new Employee("Jane Smith", 28, "E12345");
        personClassObject.displayInfo();
        employeeClassObject.displayInfo();

    }

}
