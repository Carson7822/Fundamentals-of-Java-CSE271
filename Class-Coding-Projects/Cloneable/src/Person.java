
public class Person implements Cloneable{
    
    String name;
    
    int age;
    
    Person(String passedName, int passedAge) {
        
        name = passedName;
        
        age = passedAge;
    } 
    
    public Person clone() {
        
        try {
            
            return (Person) super.clone();
            
        } catch(CloneNotSupportedException cnse) {
            
            System.out.println("Exception");
        }
        
        return null;
    }
    
    public void display() {
        
        System.out.println("Name: " + name + ", Age: " + age);
    }

}
