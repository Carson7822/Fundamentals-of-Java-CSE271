import java.util.ArrayList;

public class Book {
    
    String title;
    
    ArrayList<Author> authorList = new ArrayList<Author>();
    
    int publicationMonth;
    
    int publicationYear;
    
    Book(String passedTitle, ArrayList<Author> passedAuthorList, int passedMonth, int passedYear) {
        title = passedTitle;
        authorList = passedAuthorList;
        
        publicationMonth = passedMonth;
        
        publicationYear = passedYear;
    }
    
    public void setTitle(String passedTitle) {
        title = passedTitle;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setAuthorList(ArrayList<Author> passedAuthorList) {
        authorList = passedAuthorList;
    }
    
    public void setPublicationMonth(int passedPublicationMonth) {
        publicationMonth = passedPublicationMonth;
    }
    
    public int getPublicationMonth() {
        return publicationMonth;
    }
    
    public void setPublicationYear(int passedPublicationYear) {
        publicationYear = passedPublicationYear;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
    
    
    public boolean equals(Book passedBook) {
        
        if (getClass() != passedBook.getClass() || passedBook == null) {
            
            return false;
        }
        
        if (title == passedBook.title && authorList == passedBook.authorList) {
            
            return true;
        } else {
            
            return false;
        }
    }
    
    public String toString() {
        
        
        return authorList.toString() + " " + title + ", " + publicationMonth + ", " + publicationYear + ".";

    }
    
    public Book clone() {
        
        Book toBeReturned = new Book(title, authorList, publicationMonth, publicationYear);
        
        return toBeReturned;
    }
}
