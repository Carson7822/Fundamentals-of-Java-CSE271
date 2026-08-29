
public abstract class AbstractClass {
    
    int intVariable;
    
    String stringVariable = "Hello";
    
    AbstractClass() {
        
        System.out.println("This is the constructor of the abstract class");
        
        
    }
    
    public abstract void method1();
    
    public void method2() {
        
        System.out.println("This is method2 implemented by AbstractClass");
    }
    
}
