import java.util.Scanner;

public class Book {
	
	String title;
	String author;
	int numberOfPages;
	boolean isFiction;
	
	
	public Book() {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Please enter the title of the book.");
		String passedTitle = scannerObject.nextLine();
		System.out.println("Please enter the author of the book");
		String passedAuthor = scannerObject.nextLine();
		System.out.println("Please enter the number of pages in the book.");
		int passedNumberOfPages = scannerObject.nextInt();
		System.out.println("Please enter the boolean indicating whether the book is a fiction or not.");
		boolean passedIsFiction = scannerObject.nextBoolean();
		
		describeBook(passedNumberOfPages, passedIsFiction);
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
	public Book(int passedNumberOfPages, Boolean passedIsFiction, String passedAuthor, String passedTitle) {
		displayBookInfo(PassedNumberOfPages, passedIsFiction, passedAuthor, passedTitle);
	}
	
	
	
	public void describeBook(int passedNumberOfPages, Boolean passedIsFiction) {
		if (passedNumberOfPages > 300) {
			if (passedIsFiction) {
				System.out.println("this is a detailed fiction book.");
			} else {
				System.out.println("This is a detailed non-fiction book.");
			}
		}
		
		
		if (passedNumberOfPages <= 300) {
			if (passedIsFiction) {
				System.out.println("this is a concise fiction book.");
			} else {
				System.out.println("This is a concise non-fiction book.");
			}
		}
	}
	
	
	public void displayBookInfo(int passedNumberOfPages, Boolean passedIsFiction, String passedAuthor, String passedTitle) {
		describeBook(passedNumberOfPages, passedIsFiction);
		System.out.println("Title: " + passedTitle + ", Author: " + passedAuthor + ", Pages: " + passedNumberOfPages + ", Fiction: " + passedIsFiction);
		System.out.println("-------------------------------------------------------------------------------------");
	}
	
}
