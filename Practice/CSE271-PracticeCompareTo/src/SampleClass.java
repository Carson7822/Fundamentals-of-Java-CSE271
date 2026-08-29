//Comparable 
public class SampleClass implements Comparable<SampleClass>{

    int intInstanceVariable;
    
    Double doubleInstanceVariable;
    
    String stringInstanceVariable;
    
    SampleClass(int passedInt, double passedDouble, String passedString) {
        
        intInstanceVariable = passedInt;
        
        doubleInstanceVariable = passedDouble;
        
        stringInstanceVariable = passedString;
    }
    
    public int compareTo(SampleClass passedObject) {
        
        if (intInstanceVariable > passedObject.intInstanceVariable) {
            
            return 1;
        }
        
        if (intInstanceVariable < passedObject.intInstanceVariable) {
            
            return -1;
        }
        
    //return doubleInstanceVariable.compareTo(passedObject.doubleInstanceVariable);
        
    int doubleComparison = doubleInstanceVariable.compareTo(passedObject.doubleInstanceVariable);
    

    
    if (doubleComparison != 0) {
        return doubleComparison;
    }
    
    return stringInstanceVariable.compareTo(passedObject.stringInstanceVariable);
    
    }
    
}
