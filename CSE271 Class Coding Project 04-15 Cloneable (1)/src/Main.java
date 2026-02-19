
public class Main {

    public static void main(String[] args) {
        
        Person firstPersonObject = new Person("Alice", 25);

        Person clonedObject = firstPersonObject.clone();
        
        System.out.println("Original Object:");
        firstPersonObject.display();
        
        System.out.println("Cloned Object");
        clonedObject.display();
    }
    
    

}
