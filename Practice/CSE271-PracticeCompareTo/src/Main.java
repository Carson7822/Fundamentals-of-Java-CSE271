
public class Main {

    public static void main(String[] args) {
        
        SampleClass firstObject = new SampleClass(10, 3.4, "ABC");
        
        SampleClass secondObject = new SampleClass(10, 5.5, "ABC");
        
        System.out.println(firstObject.compareTo(secondObject));
    }

}
