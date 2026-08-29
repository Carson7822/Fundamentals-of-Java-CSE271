import java.util.Scanner;

public class MixedClass {
    String objectName;
    int numberOfIntegers;
    int numberOfDoubles;
    int[] intArray;
    //This just stores intArray but double the number of numbers.
    int[] doubleArrayList; 
    
    public MixedClass(String passedName, int passedNumberOfIntegers, int passedNumberOfDoubles) {
        objectName = passedName;
        Scanner scannerObject = new Scanner(System.in);
        numberOfIntegers = passedNumberOfIntegers;
        numberOfDoubles = passedNumberOfDoubles;
        intArray = new int[numberOfIntegers]; 
    }

    
    
    
    
    

}