package FirstPackage;

public class SubClass extends SuperClass {
    
    public SubClass() {
        
        System.out.println("I am the constructor of SubClass");
        
    }
    
    public SubClass(char passedChar, int passedInt, double passedDouble) {
        
        super(passedInt);
        
        charVariable = passedChar;
        
        doubleVariable = passedDouble;
    }
    
    public void displayIntVariable() {
        
        System.out.println(intVariable);
    }
    
}
