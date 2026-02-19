import java.util.Scanner;

public class ReadingFromConsole {

	public static void main(String[] args) {
		
		sayHello();
		
		//int intVariable1 = 5;
		
		int intToBeRead; 
		
		//printReadInt(intVariable1);
		
		Scanner scannerObject = new Scanner(System.in);
		
		while ((intToBeRead = scannerObject.nextInt()) > 0) {
			
			printReadInt(intToBeRead);
			
			System.out.println("Is the read number even? The answer is " + isEven(intToBeRead));
			
		}
	}
	
	public static void sayHello() {
		
		System.out.println("Hello.");
		
		System.out.println("Please enter some integer numbers");
		
	}
	
	public static void printReadInt(int passedInt) {
		
		System.out.println("You entered: " + passedInt);
	}
	
	public static boolean isEven(int passedInt) {
		
		if (passedInt % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	
}
