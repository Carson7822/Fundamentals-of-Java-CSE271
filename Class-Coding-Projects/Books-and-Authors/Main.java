import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        

        Author firstAuthor = new Author("Behrouz", "Zolfaghari");
        
        Author secondAuthor = new Author("Eric", "Bachmann");
        
        Author thirdAuthor = new Author("Cynthia", "Johnson");
        
        ArrayList<Author> firstAuthorArrayList = new ArrayList<Author>();
        
        firstAuthorArrayList.add(firstAuthor);
        
        firstAuthorArrayList.add(secondAuthor);
        
        ArrayList<Author> secondAuthorArrayList = new ArrayList<Author>();
        
        secondAuthorArrayList.add(thirdAuthor);
        
        
        String firstTitle = "Operating Systems";
        
        String secondTitle = "Java Programming";
       
        
        Book firstBook = new Book(firstTitle, firstAuthorArrayList, 9, 2023);
        
        Book secondBook = new Book(secondTitle, firstAuthorArrayList, 6, 2024);
        
        Book thirdBook = new Book(firstTitle, firstAuthorArrayList, 9, 2023);
        
        System.out.println(firstBook);
        System.out.println(secondBook);
        
        firstBook = thirdBook.clone();
        
        System.out.println("firstBook and thirdBook equal?: " + firstBook.equals(thirdBook));
        
        
        System.out.println("firstBook and thirdBook the same?: " +  (firstBook == thirdBook));
                
   

    }

}
