package SecondPackage;

import FirstPackage.SubClass;

public class Main {

    public static void main(String[] args) {
        
        SubClass subClassObject = new SubClass('A', 2, 3.4);
        
        subClassObject.setIntVariable(0);
        
        subClassObject.setDoubleVariable(3.4);
        
        subClassObject.displayIntVariable();
        

    }

}
