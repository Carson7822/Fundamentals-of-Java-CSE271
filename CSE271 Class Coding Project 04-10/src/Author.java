
public class Author {
    
    String firstName;
    
    String secondName;
    
    Author(String passedFirstName, String passedLastName) {
        firstName = passedFirstName;
        secondName = passedLastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return secondName;
    }
    
    public void setFirstName(String passedFirstName) {
        firstName = passedFirstName;
    }
    
    public void setLastName(String passedLastName) {
        secondName = passedLastName;
    }
    
    public Author clone() {
        
        Author toBeReturned = new Author(firstName, secondName);
        
        return toBeReturned;
    }
    
    public boolean equals(Author passedAuthor) {
        
        if (getClass() != passedAuthor.getClass() || passedAuthor == null) {
            
            return false;
        }
        
        if (firstName == passedAuthor.firstName && secondName == passedAuthor.secondName) {
            
            return true;
        } else {
            
            return false;
        }
    }
    
    public String toString() {
        
        return secondName + ". " + firstName;

    }
}
