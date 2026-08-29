package helperPackage;

abstract class Book implements Printable {
    
    private String title;
    
    private String authorName;
    
    private String publisher;
    
    private int year;
    
    Book(String passedTitle, String passedAuthorName, String passedPublisher, int passedYear) {
        
        setTitle(passedTitle);
        
        setAuthorName(passedAuthorName);
        
        setPublisher(passedPublisher);
        
        setYear(passedYear);
        
    }
    
    String getTitle() {
        return title;
    }
    
    private void setTitle(String passedTitle) {
        title = passedTitle;
    }
    
    String getAuthorName() {
        return authorName;
    }
    
    private void setAuthorName(String passedAuthorName) {
        authorName = passedAuthorName;
    }
    
    String getPublisher() {
        return publisher;
    }
    
    private void setPublisher(String passedPublisher) {
        publisher = passedPublisher;
    }
    
    int getYear() {
        return year;
    }
    
    private void setYear(int passedYear) {
        year = passedYear;
    }
    
    
    
}
