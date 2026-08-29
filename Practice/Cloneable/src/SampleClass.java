//Clone
public class SampleClass implements Cloneable{
    
    int intInstanceVariable;
    
    double doubleInstanceVariable;
    
    SampleClass(int passedInt, double passedDouble) {
        
        intInstanceVariable = passedInt;
        
        doubleInstanceVariable = passedDouble;
    }
    
    public SampleClass clone() {
        
        try {
            
            return (SampleClass) super.clone();
            
        } catch(CloneNotSupportedException cnse) {
            
            System.out.println("Exception");
        }
        
        return null;
    }
    
    public void display() {
        
        System.out.println("The Intereger Value: " + intInstanceVariable + ", The Double Value: " + doubleInstanceVariable);
    }
    
}
