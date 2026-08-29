package helperPackage;

public class TextBook extends Book {
    
    private double price;
    
    public TextBook(String passedTitle, String passedAuthorName, String passedPublisher, int passedYear, double passedPrice) {
        
        super(passedTitle, passedAuthorName, passedPublisher, passedYear);
        
        setPrice(passedPrice);
        
        print();
        
    }
    
    private void setPrice(double passedPrice) {
        
        price = passedPrice;
        
    }
    
    private double getPrice() {
        
        return price;
        
    }
    
    public void print() {
        
        System.out.println("Text Book: " + getTitle() + ", " + getAuthorName() + ", " + getPublisher() + " (" + getYear() + ") - $" + getPrice() + ".");
    }
    
}
