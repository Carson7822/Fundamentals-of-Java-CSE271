package FirstPackage;

public class FirstClass {
    
    int intVariable;
    
    private double doubleVariable;
    
    private String stringVariable;
    
    public FirstClass() {
        
        
    }
    
    public int getIntVariable() {
        
        return intVariable;
    }
    
    public void setIntVariable(int passedIntVariable) {
        
        intVariable = passedIntVariable;
    }
    
    public double getDoubleIntVariable() {
        
        return doubleVariable;
    }
    public void setDoubleVariable(double passedDoubleVariable) {
        
        doubleVariable = passedDoubleVariable;
    }
    public String getStringVariable() {
        
        return stringVariable;
    }
    public void setStringVariable(String passedStringVariable) {
        
        stringVariable = passedStringVariable;
    }
    
    public void display() {
        
        System.out.println(intVariable);
        
        System.out.println(doubleVariable);
        
        System.out.println(stringVariable);
        
        
    }

}
