import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        methodC();
        methodA();
        methodB();
    }
    
    
    
    public static void methodA() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please enter the numerator: ");
        int numerator = scannerObject.nextInt();
        System.out.println("Please enter the denominator");
        int denominator = scannerObject.nextInt();
        
        try {
            int result = (numerator / denominator);
        } catch (ArithmeticException ae) {
            System.out.println("Caught ArithmeticException: "
                    + " Cannot divide by zero. " + ae.getMessage());
        } finally { 
            System.out.println("Finally block in methodForArithmeticException");
        }
        
    }
    
    
    public static void methodB() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Please enter an integer. If the "
                + " integer is positive, "
                + "you have to enter the read string.");
        System.out.println("Otherwise, I will create an empty string:");
        String readString;
        int readInt = scannerObject.nextInt();
        
        if (readInt < 0) {
            readString = null;
        } else {
            System.out.println("Please enter a string:");
            readString = scannerObject.nextLine();
        }

        try {
            System.out.println(readString);
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException: "
                    + " The string is null.");
        } finally {
            System.out.println("End of method.");
        }
    } 
    
    public static void methodC() {
        Scanner scannerObject = new Scanner(System.in);
        int intArray[] = {0, 1, 2};
        int readIndex;
        
        System.out.print("You have an array equal to [");
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.print(intArray[i] + "].");
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }
        System.out.println(" The index you enter below will "
                + " show the index to be accesseed"
                + " in the array.");
        System.out.println("Now, please enter an index to access from "
                + " the array: ");
        readIndex = scannerObject.nextInt();
        
        try {
            System.out.println(intArray[4]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Caught ArrayIndexOutOfBoundsException. "
                    + "Index is out of"
                    + " bounds for length 3");
        } finally {
            System.out.println("End of method.");
        }
    }

}
