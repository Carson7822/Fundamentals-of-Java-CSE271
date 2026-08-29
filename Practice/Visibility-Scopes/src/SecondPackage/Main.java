package SecondPackage;

import FirstPackage.FirstClass;

public class Main {

    public static void main(String[] args) {
        
        FirstClass FirstClassObject = new FirstClass();
        
        FirstClassObject.display();
        
        FirstClassObject.setIntVariable(0);
        
        System.out.println(FirstClassObject.getIntVariable());
        
    }

}
