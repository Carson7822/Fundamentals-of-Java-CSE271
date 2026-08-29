package FirstPackage;

public class SuperClass {
    

    
    public char charVariable;
    
    public int intVariable;
    
    public double doubleVariable;
    
    
    SuperClass() {
        
        System.out.println("I am the constructor of SuperClass");
        
    }
    
    
    public SuperClass(int passedInt) {
        intVariable = passedInt;
    }
    
    public void setIntVariable(int passedIntVariable) {
        
        intVariable = passedIntVariable;
        
        System.out.println("Parameterized SuperClass Constructor");
        
    }
    
    public void setDoubleVariable(double passedDoubleVariable) {
        
        doubleVariable = passedDoubleVariable;
        
    }
    
}
