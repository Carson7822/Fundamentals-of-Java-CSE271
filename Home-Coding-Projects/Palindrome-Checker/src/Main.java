//Carson Gooch CEC271 Palindrome Checker

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		int[] passedArray = readArrayFromConsole();
		System.out.print("The input array is: [");
		printArray(passedArray);
		int[] reversedArray = reversedArray(passedArray);
		System.out.println("");
		System.out.print("The reverse array is: [");
		printArray(reversedArray);
		isPalindrome(passedArray);
	}
	public static int[] readArrayFromConsole()
	{
		int passedArrayLength;
		Scanner scannerObject = new Scanner(System.in);
		passedArrayLength = 10;
		int[] readArray;
		readArray = new int[passedArrayLength];
		System.out.println("Please enter 10 integer numbers to be stored in an array.");
		for (int i = 0; i < 10; i++) {
			readArray[i] = scannerObject.nextInt();
		}
		return readArray;
		
	}
	
	public static void printArray(int[] passedArray)
	{	
		for (int i = 0; i < 10; i++)
		{
			if (i == 9) {
				System.out.print(passedArray[i]);
			} else {
				System.out.print(passedArray[i] + ", ");
			}
		}
		System.out.print("]");
	}
	
	
	public static int[] reversedArray(int[] passedArray) 
	{
		int[] reversedArray = new int[10];
		for(int i = 0; i < 10; i++) {
			reversedArray[i] = passedArray[10 -1 - i];
		}
		return reversedArray;
	}
	
	
	public static boolean arraysEqual(int[] passedArray1, int[] passedArray2)
	{
		System.out.println("");
		for (int i = 0; i < 10; i++) {
			if (passedArray1[i] != passedArray2[i]) 
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static void isPalindrome(int[] passedArray)
	{
		int[] arrayReverse = reversedArray(passedArray);
		System.out.print("Is the input array a palindrom? The answer is: " + arraysEqual(arrayReverse, passedArray));
	}
}
