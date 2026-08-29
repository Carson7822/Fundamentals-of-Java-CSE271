package helperPackage;

public class Novel extends Book {

    private int numberOfPages;
    
    public Novel(String passedTitle, String passedAuthorName, String passedPublisher, int passedYear, int passedNumberOfPages) {
        
        super(passedTitle, passedAuthorName, passedPublisher, passedYear);
        
        setNumberOfPages(passedNumberOfPages);
        
        print();
        
    }
    
    private int getNumberOfPages() {
        
        return numberOfPages;
        
    }
    
    private void setNumberOfPages(int passedNumberOfPages) {
        
        numberOfPages = passedNumberOfPages;
        
    }
    
    public void print() {
        
        System.out.println("Novel: " + getTitle() + ", " + getAuthorName() + ", " + getPublisher() + " (" + getYear() + ") - " + getNumberOfPages() + " Pages.");
        
    }
    
}
