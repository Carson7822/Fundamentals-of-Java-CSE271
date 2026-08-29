
public class Main {

    public static void main(String[] args) {
        
        SampleClass orginialObject = new SampleClass(4, 4.5);
        
        SampleClass clonedObject = orginialObject.clone();
        
        orginialObject.display();
        
        clonedObject.display();

    }

}
