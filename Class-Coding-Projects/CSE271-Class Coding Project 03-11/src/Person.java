
public class Person {

    String name;
    int age;
    
    public Person(String passedString, int passedInt) {
        name = passedString;
        age = passedInt;
    }
    
    public void displayInfo() {
        System.out.println("Person Info");
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println("");
    }

}
